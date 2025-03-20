ORG 100H

;1
LEA SI, ARY1 ;50 45 40 35 30 25 20 15 10 5
MOV AL, 50
MOV CX, 10

L1:
MOV [SI], AL
SUB AL, 5
INC SI
LOOP L1


;2           
LEA DI, ARY1
LEA SI, ARY2  ; 50 40 30 20 10
MOV CX, 5

L2:
MOV AL, [DI]
MOV [SI], AL
INC SI  
ADD DI, 2
LOOP L2
 
 
 
 
 
;3    
MOV CX, 5
LEA SI, ARY2 

;MOV AL, [SI] 
;MOV SUM, AL
;INC SI

L3:   
MOV AL, [SI]
ADD SUM, AL
INC SI 
LOOP L3  








;4
MOV AL, [ARY2+1]
MUL [ARY2+4]
MOV PRODUCT, AX
    
    
;5
NEG PRODUCT
MOV DX, PRODUCT  





RET
ARY1 DB 10 DUP(?) 
ARY2 DB 5 DUP(?) 
SUM DB 0  ; 150   
PRODUCT DW ? ; 400