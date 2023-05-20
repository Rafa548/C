grammar CalcFrac;

program :
    stat* EOF | print EOF | assign EOF
    ;

stat :
    expr? NEWLINE
    ;

print :
    'print' expr? NEWLINE
    ;

assign :
    expr '->' Var NEWLINE
    ;

expr:
        op =('+'|'-') expr          #ExprUnaryMinus
    |   expr op=('*'|':') expr      #ExprMultDivMod
    |   expr op=('+'|'-') expr      #ExprAddSub
    |   Fraction                    #ExprRational
    |   Integer                     #ExprInteger 
    |   Var                         #ExprVar
    |   'reduce' expr               #ExprReduce
    |   '('expr')'                  #ExprParent
    ;

Integer: [0-9]+;    //implementwithlongintegers
Fraction: Integer '/' Integer   ;
Var: [a-zA-Z]+;     //implementwithstring
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;