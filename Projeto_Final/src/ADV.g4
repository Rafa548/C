grammar ADV;

program: (alphabet section*) EOF;

section: automaton | view | animation | play;
 
alphabet: 'alphabet' '{' (SYMBOL (',' SYMBOL)*)? '}' ;

automaton: AUTOMATON_TYPE? TYPE ID '<<<' state* ((state_def ';') | for_cycle)* transition '>>>' ;

state: 'state' (ID (',' ID)*)?  ';' ;

play: 'play' ID ';';

state_def : ID '[' PROPERTY_NAME '=' BOOLEAN (',' PROPERTY_NAME '=' BOOLEAN)* ']' ; 

transition: 'transition' (transition_def ','?)* ';' ;

transition_def: ID '->' SYMBOL (',' SYMBOL)* '->' (ID | '{' ID (',' ID)* '}') ;

view: 'view' ID 'of' ID '<<<' view_content* '>>>' ;

view_content: ('place' view_state*) ';' | (declare_point ';') | construct_line* ';' | place* ';' | grid* ';';

grid: 'grid' ID '(' DOUBLE ',' DOUBLE ')' '[' grid_opt '=' (DOUBLE|ID) (',' grid_opt '=' (DOUBLE|ID))* ']';

grid_opt: 'step' | 'margin' | 'color' | 'line' ;

place : ('place')? '<' ID ',' ID '>' '#label' '[' 'align' '=' align_type* ']' ('at' ID)?;

construct_line: '<' ID ',' ID '>' 'as' ID ('--' ID)* ;

view_state: ID 'at' expr (',')? ; 

point: '(' expr div=(','|':') expr ')';

declare_point:  ('point'? ((initID)|ID) ((',' ID) | ',' initID)*);

initID: ID '=' expr;

expr:  expr op=('/'|'*') expr       #ExprMulDiv
      | op=('+'|'-') expr           #ExprUnary
      | expr op=('+'|'-') expr      #ExprAddSub
      | point                       #ExprPoint
      | DOUBLE                      #ExprDouble
      | ID                          #ExprID
      |'(' expr ')'                #ExprParenthesis; //se  (A) + (2,1) com a ser estado A passaa ser ponto

animation: 'animation' ID '<<<' (animation_content+ animation_def*)* '>>>' ;

animation_content: 'viewport' ID 'for' ID 'at' expr '--' '++' expr ';';

animation_def: 'on' ID '<<<' (action | for_cycle)* ('pause' ';')? '>>>'  ('pause' ';')?; 

action: 'show' (action_part (',' action_part)* ';' ('pause' ';')? ); 

action_part: (ID | '{' ID (',' ID)* '}' | '<' ID ',' ID '>' | '<' ID ',' ID ',' SYMBOL '>'| state_def);

align_type: 'below' | 'above' | 'left' | 'right' | 'center' | 'top' | 'bottom';

for_cycle: 'for' ID 'in' '{{' ID (',' ID)* '}}' ((state_def  ';') | '<<<' 'show' state_def ';' '>>>') ;

SINGLE: '/*' .*? '*/' -> skip;

BLOCK:  '//' ~[\r\n]* -> skip;

PROPERTY_NAME: 'initial' | 'accepting' ;

AUTOMATON_TYPE : 'complete';

TYPE: 'DFA' | 'NFA';

SYMBOL: '\'' ~[']'\'';

BOOLEAN: 'true' | 'false' ;

DOUBLE: (INT '.' INT)|INT;

INT: [0-9]+ ;

ID: [a-zA-Z][a-zA-Z0-9_]* ;

WS: [ \t\r\n]+ -> skip ;