package com.duoc.modelos;

public class CustomException extends Exception{
    
    private static final long serialVersionUID = 700L;
    
    public CustomException(String mensaje){
        super(mensaje);
    }
}
