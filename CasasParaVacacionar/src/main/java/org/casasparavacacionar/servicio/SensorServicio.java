/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.casasparavacacionar.servicio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.casasparavacacionar.dao.BaseDeDatosSensor;
import org.casasparavacacionar.modelo.Sensor;

/**
 *
 * @author Inerjanuer
 */
public class SensorServicio {
    
    private final List<Sensor> listado = BaseDeDatosSensor.getInstancia().getListado();
    private Calendar creado = new GregorianCalendar();
    
    public List<Sensor> getSensores(){
        return listado;
    }
    
    public Sensor getSensor(int id){
        for (Sensor sensor: listado){
            if(sensor.getId() == id){
                return sensor;
            }
        }
        return null;
    }
    
    public Sensor addSensor(Sensor sensor){
        sensor.setId(getMaximo());
        sensor.setCreado(creado);
        listado.add(sensor);
        return sensor;
    }
    
    
    public Sensor updateSensor(Sensor sensor){
        int posicion = getPosicion(sensor.getId());
        try {
            listado.set(posicion, sensor);
        } catch (IndexOutOfBoundsException ioobe) {
            return null;
        }
        return sensor;
    }
    
    public List<Sensor> getNombreSensor(String nombre){
        List<Sensor> resultado = new ArrayList<>();
        for (Sensor sensor : listado){
            if(sensor.getNombre().equalsIgnoreCase(nombre)){
                resultado.add(sensor);
            }
        }
        return resultado;
    }
    
    public void deleteSensor(int id){
        int posicion = getPosicion(id);
        listado.remove(posicion); 
    }
    
    private int getPosicion(int id){
        for (int  i = 0; i<listado.size(); i++){
            if(listado.get(i).getId()== id ){
                return i;
            }
        }
        return -1;
    }
    
    private int getMaximo(){
        int size = listado.size();
        if(size > 0){
            return listado.get(size - 1).getId() +1;
        }else{
            return 1;
        }
    }
    
}
