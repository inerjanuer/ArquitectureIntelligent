/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.casasparavacacionar.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbTransient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Inerjanuer
 */

@XmlRootElement
public class Usuario {
    
    private int id;
    
    private String user;
    
    private String pass;
    
    private List<RegistroAdicionSensores> adicion = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(int id, String user, String pass) {
        this.id = id;
        this.user = user;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    @JsonbTransient
    @XmlTransient
    public List<RegistroAdicionSensores> getAdicion() {
        return adicion;
    }

    public void setAdicion(List<RegistroAdicionSensores> ventas) {
        this.adicion = ventas;
    }
}
