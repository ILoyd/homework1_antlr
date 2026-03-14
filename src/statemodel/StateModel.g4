grammar StateModel;

model
    : statesBlock transitionsBlock EOF
    ;

statesBlock
    : STATES LCURLY stateDef* initialStateDef stateDef* RCURLY
    ;

stateDef
    : stateName LCURLY stateLabels? RCURLY isError?
    ;

initialStateDef
    : isInitial stateDef
    ;

stateLabels
    : id (COMMA id)*
    ;

transitionsBlock
    : TRANSITIONS LCURLY transitionElement* RCURLY
    ;

transitionElement
    : schemaDef
    | transitionDef
    ;

schemaDef
    : TRANS (NORMAL | ERROR) id
    ;

transitionDef
    : id DDOT stateName TRANSITION stateName
    ;

isInitial: INITIAL;
stateName: STATE_NAME;
isError: ERROR;
id: ID;

LCURLY: '{';
RCURLY: '}';
DDOT: ':';
COMMA: ',';
TRANSITION: '->';

STATES: 'states';
INITIAL: 'initial';
NORMAL: 'normal';
ERROR: 'error';
TRANSITIONS: 'transitions';
TRANS: 'trans';

STATE_NAME: [A-Z][A-Z0-9]*;
ID: [a-z][a-z0-9]*;

WS:  (' '| '\t' | '\n' | '\r') -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;

