grammar J;


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
    | statement)+ EOF
    | EOF
    ;

statement
    : block
    | typeType ID ';'
    | 'if' parExpression statement ('else' statement)?
    | 'while' parExpression statement
    | 'return' expression? ';'
    | expression ';'
    ;


block
    : '{' blockStatement* '}'
    ;

blockStatement
    : typeType ID ';'
    | statement
    ;

classDeclaration
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

methodDeclaration
    :  (typeType|'void') ID formalParameters methodBody
    | fieldDeclaration
    ;

methodBody
    : block
    ;

fieldDeclaration
    : typeType ID ';'
    ;

formalParameters
    : '(' formalParameterList? ')'
    ;
formalParameterList
    : formalParameter (',' formalParameter)*
    ;
formalParameter
    : typeType ID
    ;

typeType
    : primitiveType
    | ID
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
    : expression (',' expression)*
    ;
statementExpression
    : expression
    ;
expression
    : primary
    | expression '.' ID
    | expression '(' expressionList? ')'
    | 'new' ID '(' ')'
    | expression op=('*'|'/'|'%') expression
    | expression op=('+'|'-') expression
    | <assoc=right> expression '=' expression
    ;

primary
    : parExpression
    | 'this'
    | INT
    | FLOAT
    | STRING
    | ID
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
