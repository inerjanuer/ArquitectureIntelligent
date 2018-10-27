/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casasparavacacionar.logica.interfaces;

import com.mycompany.casasparavacacionar.dto.Usuario;
import com.mycompany.casasparavacacionar.excepciones.OperacionInvalidaException;
import java.util.List;

/**
 *
 * @author Inerjanuer
 */
public interface IServicioCatalogoMockLocal {
    
    public void registrar (Usuario u ) throws OperacionInvalidaException;
    
    public void eliminarCliente ( String login )throws OperacionInvalidaException;
    
    public List<Usuario> darClientes();
    
}
