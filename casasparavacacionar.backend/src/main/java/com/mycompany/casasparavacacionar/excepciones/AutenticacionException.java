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
public class AutenticacionException extends Exception {
    
    /**
     * Constructor de la clase
     * @param mensaje 
     */
    public AutenticacionException(String mensaje){
        super(mensaje);
    }
    
}
