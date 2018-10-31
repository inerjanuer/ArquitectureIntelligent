/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.casasparavacacionar.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Inerjanuer
 */

@XmlRootElement
public class Usuario {
    
    private int id;
    
    private String user;
    
    private String pass;
    
    //private String nombre;
    
    //private Ciudad ciudad;
    
    //private long cedula;
    
    //private long telefonoFijo;
    
    //private long telefonoMovil;
    
    private List<RegistroVentaSensores> ventas = new ArrayList<>();

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
    
    

    /*public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public long getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(long telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public long getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(long telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }    */

    public List<RegistroVentaSensores> getVentas() {
        return ventas;
    }

    public void setVentas(List<RegistroVentaSensores> ventas) {
        this.ventas = ventas;
    }
}
