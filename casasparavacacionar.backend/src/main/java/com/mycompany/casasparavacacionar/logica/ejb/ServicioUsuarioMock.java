/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casasparavacacionar.logica.ejb;

import com.mycompany.casasparavacacionar.dto.Usuario;
import com.mycompany.casasparavacacionar.excepciones.OperacionInvalidaException;
import com.mycompany.casasparavacacionar.logica.interfaces.IServicioPersistenciaMockLocal;
import javax.ejb.Stateless;
import com.mycompany.casasparavacacionar.logica.interfaces.IServicioUsuarioMockLocal;
import com.mycompany.casasparavacacionar.persistencia.mock.ServicioPersistenciaMock;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Inerjanuer
 */
@Stateless
public class ServicioUsuarioMock implements IServicioUsuarioMockLocal{
    private final IServicioPersistenciaMockLocal persistencia;
    
    public ServicioUsuarioMock(){
        persistencia = new ServicioPersistenciaMock();
    }
    
    /**
     *
     * @param usuario
     */
    @Override
    public void agregarUsuario(Usuario usuario){
        try {
            persistencia.create(usuario);
        } catch (OperacionInvalidaException ex) {
            Logger.getLogger(ServicioCatalogoSensoresMock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public List<Usuario> darUsuarios(){
        return persistencia.findAll(Usuario.class);
    }
}
