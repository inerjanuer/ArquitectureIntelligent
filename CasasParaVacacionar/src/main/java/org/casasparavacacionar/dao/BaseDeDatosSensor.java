/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.casasparavacacionar.dao;

import java.util.ArrayList;
import java.util.List;
import org.casasparavacacionar.modelo.Sensor;

/**
 *
 * @author Inerjanuer
 */
public final class BaseDeDatosSensor {

    private final static BaseDeDatosSensor baseDeDatos = new BaseDeDatosSensor();
    private final List<Sensor> listado = new ArrayList<>();

    public BaseDeDatosSensor() {
        Sensor sensor1 = new Sensor(1, "Sensor optico", "Detecta la presencia de una persona o de un objeto que interrumpe el haz de la luz que le llega al sensor");
        Sensor sensor2 = new Sensor(2, "Sensor contacto", "Detectan cuando una puerta o una ventana se habren automaticamente.");
        Sensor sensor3 = new Sensor(3, "Sensor temperatura", "Detectan cuando regulacion del sistema de calefaccion y aire acondicionado disminuye o aumenta.");
        Sensor sensor4 = new Sensor(4, "Sensor humedad", "Detectan el nivel de liquido en un deposito.");
        Sensor sensor5 = new Sensor(5, "Sensor magnetico", "Detectan posicion de un automovil, detectando la proximidad sin contacto directo.");
        Sensor sensor6 = new Sensor(6, "Sensor infrarrojo", "Detectan las emisiones de los diodos hacia un objeto.");
        
        listado.add(sensor1);
        listado.add(sensor2);
        listado.add(sensor3);
        listado.add(sensor4);
        listado.add(sensor5);
        listado.add(sensor6);
    }

    public static BaseDeDatosSensor getInstancia() {
        return baseDeDatos;
    }

    public List<Sensor> getListado() {
        return listado;
    }

}
