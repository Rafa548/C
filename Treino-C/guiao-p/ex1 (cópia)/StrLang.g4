grammar StrLang;

program: command* EOF;

command: print|assignment;

print: 'print' expr;

assignment: Var ':' expr;

expr: String #exprString
     | 'input(' expr ')' #exprinput
     | Var #exprVar;

String: '"' .*? '"';
Var:[a-zA-Z1-9_]+;
WS: [ \n\t\r] -> skip;
Comment: '\\' .*? '\n'->skip;
Error: .;

