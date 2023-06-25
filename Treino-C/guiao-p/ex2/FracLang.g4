grammar FracLang;

programm: (command ';')* EOF;

command: display | assignment;

display: 'display' expr;

assignment: ID '<=' expr;

expr: 
      op=('+'|'-') expr #exprUnary
    | expr op=('*'|':') expr #exprMultDiv
    | expr op=('+'|'-') expr #exprSomSub
    | '(' expr ')' #exprPar
    | 'read' String #exprRead
    | 'reduce' expr #exprReduce
    | Fraction  #exprFrac
    | ID        #exprID;

ID:[a-z]+;
String: '"' .*? '"';
Fraction:[1-9]+ ('/' [1-9]+)?;
WS:[ \n\t\r]->skip;
Comment: '--' .*? '\n' -> skip;
Error: .;