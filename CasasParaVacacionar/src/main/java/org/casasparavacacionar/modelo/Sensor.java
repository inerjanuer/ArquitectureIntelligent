/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.casasparavacacionar.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Inerjanuer
 */
@XmlRootElement
public class Sensor {
    
    private int id;
    
    private String  nombre;
    
    private String descripcion;
    
    private Calendar creado;

    public Sensor() {
    }

    public Sensor(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creado = new GregorianCalendar();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Calendar getCreado() {
        return creado;
    }

    public void setCreado(Calendar creado) {
        this.creado = creado;
    }
}
