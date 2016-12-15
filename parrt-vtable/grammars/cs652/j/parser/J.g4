grammar J;

@header {
import cs652.j.semantics.*; // You will need these for stuff in "returns" clauses
import org.antlr.symbols.*;
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

file
    : (classDeclaration
    | expression ';' | blockExpression | whileStatement | ifStatement )+
    | EOF
    ;


expression
    : ID ('.' ID)* '(' callParameters? ')'   //调用函数
    | ifStatement
    | whileStatement
    | variableDeclaration
    | assign
    | newDefinition
    | 'return' expression
    | ID ('.' expression)*
    | ID
    | STRING
    | INT
    | FLOAT
    ;

whileStatement
    : 'while' '(' expression ')' (expression ';' | blockExpression)
    ;

ifStatement
    : 'if' '(' expression ')' (expression ';' | blockExpression ) (elseStatement|blockExpression)?
    ;

blockExpression
    : '{' (expression ';')* '}'
    ;

elseStatement
    : 'else' (expression ';' | ifStatement | blockExpression)
    ;

newDefinition
    : 'new' ID '(' callParameters? ')'
    ;

variableDeclaration
    : type ID
    ;

assign
    : ID ('.' ID)* '=' expression
    ;



callParameters
    : expression (',' expression)*
    ;


classDeclaration
    : 'class' ID ('extends' ID)? '{' classBody? '}'
    ;

classBody
    : (methodDeclaration
        | fields
    )+
    ;

fields
    : variableDeclaration ';'
    ;

methodDeclaration
    : type ID formalParameters methodBody
    ;

methodBody
    : '{' (expression ';')* '}'
    ;


type
    : ID
    ;
    
formalParameters   
    : '(' parameters? ')'
    ;

parameters
    : type ID (',' type ID)*
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
