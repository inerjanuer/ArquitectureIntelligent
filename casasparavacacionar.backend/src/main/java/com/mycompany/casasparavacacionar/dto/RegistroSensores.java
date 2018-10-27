/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casasparavacacionar.dto;

import java.util.Date;

/**
 *
 * @author Inerjanuer
 */
class RegistroSensores {
    
    private Date fechaAdicionSensor;
        
    private Sensor producto;
    
    private int cantidad;
    
    private String propiedad;
    
    private Usuario adicionSensorUsuario;
    
    public RegistroSensores(){}
    
    public RegistroSensores(Date fechaAdicionSensor, Sensor producto,int cantidad, String propiedad, Usuario adicionSensorUsuario ){
        this.fechaAdicionSensor= fechaAdicionSensor;
        this.producto= producto;
        this.cantidad= cantidad;
        this.propiedad=propiedad;
        this.adicionSensorUsuario=adicionSensorUsuario;
    }

    public Date getFechaAdicionSensor() {
        return fechaAdicionSensor;
    }

    public void setFechaAdicionSensor(Date fechaAdicionSensor) {
        this.fechaAdicionSensor = fechaAdicionSensor;
    }

    public Sensor getProducto() {
        return producto;
    }

    public void setProducto(Sensor producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    public Usuario getAdicionSensorUsuario() {
        return adicionSensorUsuario;
    }

    public void setAdicionSensorUsuario(Usuario adicionSensorUsuario) {
        this.adicionSensorUsuario = adicionSensorUsuario;
    }

  
    
    
}
