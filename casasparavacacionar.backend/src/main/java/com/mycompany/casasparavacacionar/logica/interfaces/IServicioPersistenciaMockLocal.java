/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casasparavacacionar.logica.interfaces;

import com.mycompany.casasparavacacionar.excepciones.OperacionInvalidaException;

/**
 *
 * @author Inerjanuer
 */
public interface IServicioPersistenciaMockLocal {
    
    public void create (java.lang.Object obj ) throws OperacionInvalidaException;
    
    public void update (java.lang.Object obj) throws OperacionInvalidaException;
    
    public void delete (java.lang.Object obj) throws OperacionInvalidaException;
    
    public java.util.List findAll(java.lang.Class c);
    
    public java.lang.Object findById(java.lang.Class c, Object id);
    
}
