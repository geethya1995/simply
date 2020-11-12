grammar grammars;

prog
    : (get | function)*
    ;

get
    : 'get' ID EOL
    ;

function
    : 'function' ID '(' 'inputs' ':'  paramList ')' ':' funcOut block
    ;

paramList
    : param? (',' param)*
    ;

param
    : dtype ID
    ;

dtype
    : 'int'
    | 'float'
    | 'string'
    | 'bool'
    ;

funcOut
    : 'output' funcOutDtype
    ;

funcOutDtype
    : 'int'
    | 'float'
    | 'string'
    | 'bool'
    | 'nothing'
    ;

block
    : '{' stat* '}'
    ;

stat
    : block
    | display
    | varDecl                   // declare and declare and assign
    | constDecl
    | ifStmt
    | whileStmt
    | forStmt
    | returnStmt
    | expr '=' expr EOL         // assign
    | expr EOL                  // func call
    ;

display
    : 'display' '(' expr ')' EOL
    ;

varDecl
    : dtype? ID ('=' expr)? EOL
    ;

constDecl
    : 'const' dtype ID '=' expr EOL
    ;

expr
    : '(' expr ')'
    | ID ('++' | '--')
    | ID '.' ID '(' exprList ')'       // function call
    | ('++' | '--') ID
    | '!' expr
    | expr '**' expr
    | expr '%' expr
    | expr '*' expr
    | expr '/' expr
    | expr '+' expr
    | expr '-' expr
    | expr '<' expr
    | expr '<=' expr
    | expr '>' expr
    | expr '>=' expr
    | expr '==' expr
    | expr '!=' expr
    | expr ('!' | 'not') expr
    | expr 'and' expr
    | expr 'or' expr
    | ID
    | literal
    ;

exprList
    : expr? (',' expr)*
    ;

literal
    : INTEGER_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    ;

ifStmt
    : 'check' '(' expr ')' 'then' block elif* ('else' block)?
    ;

elif
    : 'else-check' '(' expr ')' 'then' block
    ;

whileStmt
    : 'repeat' '(' expr ')' block
    ;

forStmt
    : 'repeat' '(' forControl ')' block
    ;

forControl
    : varDecl 'range' ':' INTEGER_LITERAL 'to' INTEGER_LITERAL EOL 'change' ':' INTEGER_LITERAL
    ;

returnStmt
    : 'return' expr EOL
    ;

INTEGER_LITERAL: '1'..'9' '0'..'9'* ;

FLOAT_LITERAL: INTEGER_LITERAL '.' '0'..'9'+ ;

STRING_LITERAL
    : '"' (ESC | .)*? '"'
    ;

fragment ESC: '\\"' | '\\\\' ;

BOOL_LITERAL: 'true' | 'false' ;

ID
    : ('a'..'z' | 'A'..'Z') ('_' | 'a'..'z' | 'A'..'Z' | '0'..'9')*
    ;

EOL
    : ';'
    ;

LINE_COMMENT
    : '#' .*? '\r'? '\n' -> skip
    ;

MULTI_LINE_COMMENT
    : '/*' .*? '*/' -> skip
    ;

WS
    : [ \t\r\n\u000C]+ -> skip
    ;