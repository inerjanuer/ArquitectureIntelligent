/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.casasparavacacionar.dao;

import java.util.ArrayList;
import java.util.List;
import org.casasparavacacionar.modelo.RegistroAdicionSensores;
import org.casasparavacacionar.modelo.Usuario;
import org.casasparavacacionar.servicio.SensorServicio;

/**
 *
 * @author Inerjanuer
 */
public class BaseDeDatosUsuario {
    
    private final static BaseDeDatosUsuario baseUsuario = new BaseDeDatosUsuario();
    private final List<Usuario> user = new ArrayList<>();
    private final SensorServicio sensor=null;

    public BaseDeDatosUsuario() {
        
        Usuario user1 = new Usuario(1, "Inerjanuer", "12345");
        Usuario user2 = new Usuario(2, "JorgePoveda", "67890");
        Usuario user3 = new Usuario(3, "Chirstian", "24680");
        
        user1.getAdicion().add(new RegistroAdicionSensores( 1, "Sensor Optico", 3 ));
        
        user.add(user1);
        user.add(user2);
        user.add(user3);
    }
    
    public static BaseDeDatosUsuario getInstanceUser(){
        return baseUsuario;        
    }
    
    public List<Usuario> getListadoUser(){
        return user;
    }
}
