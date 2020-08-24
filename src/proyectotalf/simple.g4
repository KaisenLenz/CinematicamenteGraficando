grammar simple;

@lexer::header{
    package proyectotalf;
}


@parser::header{
    package proyectotalf;
}


start :
    consultas+
;

consultas:  mru_cuerpo
            |mrua_cuerpo
            |caida_cuerpo 
            |lva_cuerpo  
            |lvab_cuerpo ;

//Cuerpo
mru_cuerpo : MRU  OPEN_B  assign+ CLOSE_B ;

mrua_cuerpo:MRUA  OPEN_B  assign+ CLOSE_B ;

caida_cuerpo :CAIDA  OPEN_B assign+ CLOSE_B ;

lva_cuerpo :LVA  OPEN_B  assign+  CLOSE_B ;

lvab_cuerpo :LVAb  OPEN_B assign+  CLOSE_B ;

assign: variable '=' (DOUBLE | ASK);

variable: ACELERACION | TIEMPO | DISTANCIA |POS_INIC |POS_FINAL |VELOCIDAD |VELOCIDAD_INICIAL |VELOCIDAD_FINAL;

//Cabecera

MRU :       'MRU';
MRUA:       'MRUA';
CAIDA:      'CLibre';
LVA:        'LVArriba';
LVAb:       'LVAbajo';

OPEN_B:     '{';
CLOSE_B:    '}';

ASK: '?';

//Variables
ACELERACION:            'ACELERACION';
TIEMPO:                 'TIEMPO';
DISTANCIA:              'DISTANCIA';
POS_INIC:               'POSICION_INICIAL';
POS_FINAL:              'POSICION_FINAL';
VELOCIDAD:              'VELOCIDAD';
VELOCIDAD_INICIAL:      'VELOCIDAD_INICIAL';
VELOCIDAD_FINAL:        'VELOCIDAD_FINAL';



DOUBLE:    '-'* NUMBER
            |'-'*NUMBER PUNTO NUMBER
            |PUNTO NUMBER;

PUNTO: '.';

NUMBER: [0-9]+;

ID: [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\n\r]+ -> skip;
    