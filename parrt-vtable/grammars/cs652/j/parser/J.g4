grammar J;

@header {
import cs652.j.semantics.*; // You will need these for stuff in "returns" clauses
import org.antlr.symtab.*;
}

//file returns [GlobalScope scope] // this allows us to annotate trees with symtab info
//    :   ... EOF
//    ;
//
//expression returns [Type type] // annotate all expression nodes with type info
//    :   ...
//    ;
//
// ...

file returns [GlobalScope scope]
    : classDeclaration*  statementOfMain EOF
    | EOF
    ;

statementOfMain returns [LocalScope scope]
    : statement*
    ;

statement
    : block
    | variableDeclaration
    | 'if' parExpression statement ('else' statement)?
    | 'while' parExpression statement
    | 'return' expression? ';'
    | expression ';'
    ;


block returns [LocalScope scope]
    : '{' blockStatement* '}'
    ;

blockStatement
    : variableDeclaration
    | statement
    ;

classDeclaration returns [JClass scope]
    : 'class' ID ('extends' typeType)? classBody
    ;

classBody
    : '{' classBodyDeclaration* '}'
    ;
classBodyDeclaration
    : ';'
    | block
    | methodDeclaration
    ;

methodDeclaration returns[JMethod scope]
    : typeType ID formalParameters methodBody #labelMethod
    | fieldsDeclaration #labelField
    ;

methodBody
    : block
    ;
fieldsDeclaration
    :  typeType ID ';'
    ;

variableDeclaration
    : typeType ID ';'
    ;

formalParameters
    : '(' formalParameterList? ')'
    ;
formalParameterList
    : t+=formalParameter (',' t+=formalParameter)*
    ;
formalParameter
    : typeType ID
    ;

typeType
    : primitiveType
    | ID
    | 'void'
    ;

primitiveType
    : 'int'
    | 'float'
    ;

// EXPRESSIONS
parExpression
    : '(' expression ')'
    ;
expressionList
    : e+=expression (',' e+=expression)*
    ;
statementExpression
    : expression
    ;
expression returns [Type type]
    : primary                               #labelOfPrimary
    | expression '.' ID  #lableOfFieldVisit
    | 'printf' '(' expressionList ')' #labelOfPrintf
    | expression '(' expressionList? ')' #labelOfCall
    | 'new' ID '(' ')'  #labelOfNew
    | expression op=('*'|'/'|'%') expression #labelOfMult
    | expression op=('+'|'-') expression #labelOfAdd
    | <assoc=right> expression '=' expression #labelOfAssign
    ;

primary returns [Type type]
    : parExpression #labelParExpression
    | 'this'        #labelThis
    | INT           #labelInt
    | FLOAT         #labelFloat
    | STRING        #labelString
    | ID            #labelID
    ;


ID : [a-zA-Z_]+ [a-zA-Z0-9_]* ;
WS : [ \t\n\r]+ -> skip;
STRING : '"' (~'"'|'\\"')* '"'  ;
FLOAT
    :   '-'? INT '.' INT EXP?   // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? INT EXP            // 1e10 -3e4
    ;
INT : '-'? [0-9]+ ; // no leading zeros


fragment EXP :   [Ee] [+\-]? INT ;
COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ;
