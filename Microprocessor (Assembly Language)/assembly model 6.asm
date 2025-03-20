ORG 100H


;1
MOV AL, 50
MOV CX, 10
LEA DI, ARY1

L1:
MOV [DI], AL
SUB AL, 5
INC DI
LOOP L1

;2      
LEA DI, ARY1
LEA SI, ARY2
MOV CX, 5


L2:     
MOV AL, [DI]
MOV [SI], AL 
INC SI
ADD DI, 2    
LOOP L2

;3      
LEA SI, ARY2     
MOV SUM, 0H
MOV CX, 5

L3:
MOV AL, [SI]
ADD SUM, AL
INC SI
LOOP L3

;4  
LEA SI, ARY2
MOV AL, [SI + 4]
MUL [SI + 1]
MOV PRODUCT, AX

;5
MOV DX, PRODUCT
NEG DX 





RET
ARY1 DB 10 DUP(?)         
ARY2 DB 5  DUP(?)  
SUM DB ?         
PRODUCT DW ?