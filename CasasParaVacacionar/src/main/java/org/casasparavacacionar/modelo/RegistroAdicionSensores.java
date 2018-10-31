/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.casasparavacacionar.modelo;

/**
 *
 * @author Inerjanuer
 */

public class RegistroAdicionSensores {
    
    private int id;
    
    private String sensor;
    
    private int cantidad;
    
    
    //private Vendedor vendedor;

    public RegistroAdicionSensores() {
    }

    public RegistroAdicionSensores(int id, String sensor, int cantidad) {
        this.id = id;
        this.sensor = sensor;
        this.cantidad=cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }  

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
