/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casasparavacacionar.dto;

/**
 *
 * @author Inerjanuer
 */
class Sensor {
    
    private long referencia;
    
    private String nombre;
    
    private String descripcion;
    
    private TipoSensor tipo;
    
    private double precio;
    
    private String imagen;
    
    private int cantidad;
    
    private boolean seleccion;
    
    
    public Sensor(){}
    
    public Sensor(long referencia, String nombre, String descripcion, TipoSensor tipo,double precio, String imagen, int cantidad, boolean seleccion ){
        this.referencia=referencia;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.tipo=tipo;
        this.precio=precio;
        this.imagen=imagen;
        this.cantidad=cantidad;
        this.seleccion=seleccion;
    }

    public long getReferencia() {
        return referencia;
    }

    public void setReferencia(long referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoSensor getTipo() {
        return tipo;
    }

    public void setTipo(TipoSensor tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isSeleccion() {
        return seleccion;
    }

    public void setSeleccion(boolean seleccion) {
        this.seleccion = seleccion;
    }
    
    public void incrementarCantidad(){
        cantidad++;
    }
    
    public void reducirCantidad(){
        cantidad--;
    }
            
}
