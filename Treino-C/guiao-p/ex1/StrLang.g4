grammar StrLang;

program: (command)* EOF;

command: print | assignment;

print: 'print' expr;

assignment: Var ':' expr ;

expr: 
      Var         #exprVar
    | 'input(' expr ')' #exprInput
    | expr op=('+'|'-') expr #exprConcatRemove
    | 'trim' expr  #exprTrim
    | '(' expr ')' #exprParen
    | expr '/' expr '/' expr #exprReplace
    | String      #exprString ;

String: '"' .*? '"';
Var: [a-zA-Z1-9]+;
WS: [ \n\t\r] -> skip;
Comment: '//' .*? '\n' -> skip;
Error: .;