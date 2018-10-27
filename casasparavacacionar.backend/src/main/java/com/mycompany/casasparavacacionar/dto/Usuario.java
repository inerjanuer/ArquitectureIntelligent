/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casasparavacacionar.dto;

import java.util.ArrayList;

/**
 *
 * @author Inerjanuer
 */
public class Usuario {
    
    private String login;
    
    private String contraseña;
    
    private String nombreCompleto;
    
    private long documento;
    
    private long telefonoLocal;
    
    private long telefonoCelular;
    
    private Ciudad ciudad;
    
    private String direccion;
    
    private String correo;
    
    private ArrayList<RegistroSensores>compraSensores;
    
    
    public Usuario(){}
    
    public Usuario (String login, String contraseña){
        this.login= login;
        this.contraseña = contraseña; 
        this.compraSensores = new ArrayList<RegistroSensores>();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public long getTelefonoLocal() {
        return telefonoLocal;
    }

    public void setTelefonoLocal(long telefonoLocal) {
        this.telefonoLocal = telefonoLocal;
    }

    public long getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(long telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<RegistroSensores> getCompraSensores() {
        return compraSensores;
    }

    public void setCompraSensores(ArrayList<RegistroSensores> compraSensores) {
        this.compraSensores = compraSensores;
    }
    
    
}
