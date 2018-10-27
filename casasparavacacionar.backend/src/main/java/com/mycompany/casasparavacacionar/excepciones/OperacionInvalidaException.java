/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casasparavacacionar.excepciones;

/**
 *
 * @author Inerjanuer
 */
public class OperacionInvalidaException extends Exception{
    
    /**
     * Constructor de la clase para excepciones
     * @param mensaje 
     */
    public OperacionInvalidaException(String mensaje){
        super(mensaje);
    }
    
}
