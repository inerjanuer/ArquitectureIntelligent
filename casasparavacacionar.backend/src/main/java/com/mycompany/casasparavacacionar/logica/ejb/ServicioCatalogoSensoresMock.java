/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casasparavacacionar.logica.ejb;

import com.mycompany.casasparavacacionar.excepciones.OperacionInvalidaException;
import com.mycompany.casasparavacacionar.logica.interfaces.IServicioCatalogoMockLocal;
import com.mycompany.casasparavacacionar.logica.interfaces.IServicioCatalogoMockRemote;
import com.mycompany.casasparavacacionar.logica.interfaces.IServicioPersistenciaMockLocal;
import com.mycompany.casasparavacacionar.persistencia.mock.ServicioPersistenciaMock;
import com.mycompany.casasparavacacionar.dto.Usuario;
import com.sun.istack.internal.logging.Logger;
import java.util.List;
import java.util.logging.Level;
import javax.ejb.Stateless;

/**
 *
 * @author Inerjanuer
 */

@Stateless
public class ServicioCatalogoSensoresMock implements IServicioCatalogoMockRemote, IServicioCatalogoMockLocal{
    
    
    private IServicioPersistenciaMockLocal persistencia;
    private Object Sensor;
    
    
    public ServicioCatalogoSensoresMock(){
        persistencia = new ServicioPersistenciaMock();
    }
    
    public void agregarSensor(Sensor sensor){
        try {
            persistencia.create(Sensor);
        } catch (OperacionInvalidaException ex) {
            Logger.getLogger(ServicioCatalogoSensoresMock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void registrar(Usuario u) throws OperacionInvalidaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarCliente(String login) throws OperacionInvalidaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> darClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(Object obj) throws OperacionInvalidaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object obj) throws OperacionInvalidaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List findAll(Class c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object findById(Class c, Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
