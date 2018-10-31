/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.casasparavacacionar.servicio;

import java.util.ArrayList;
import java.util.List;
import org.casasparavacacionar.dao.BaseDeDatosUsuario;
import org.casasparavacacionar.modelo.Usuario;

/**
 *
 * @author Inerjanuer
 */
public class UsuarioServicio {
    
    private final List<Usuario> lista = BaseDeDatosUsuario.getInstanceUser().getListadoUser();
   
    public List<Usuario> getUsuarios(){
        return lista;
    }
    
    public Usuario getUsuario (int id){
        for (Usuario usuario : lista){
            if(usuario.getId() == id){
                return usuario;
            }
        }
        return null;
    }
    
    public Usuario addUsario(Usuario usuario){
        usuario.setId(getMaximo());
        lista.add(usuario);
        return usuario;
    }
    
    public Usuario updateUsuario(Usuario usuario){
        int posicio = getPosicion(usuario.getId());
        try {
            lista.set(posicio, usuario);
        } catch (IndexOutOfBoundsException ioobe) {
            return null;
        }
        return usuario;
    }
    
    public List<Usuario> getNombreUsuario (String nombre){
        List<Usuario> resultado = new ArrayList<>();
        for(Usuario usuario : lista){
            if(usuario.getUser().equalsIgnoreCase(nombre)){
                resultado.add(usuario);
            }
        }
        return resultado;
    }
    
    public void deleteUsuario ( int id){
        int posicion = getPosicion(id);
        lista.remove(posicion);
    }
    
    private int getPosicion(int id){
        for (int  i = 0; i<lista.size(); i++){
            if(lista.get(i).getId()== id ){
                return i;
            }
        }
        return -1;
    }
    
    private int getMaximo(){
        int size = lista.size();
        if(size > 0){
            return lista.get(size - 1).getId() +1;
        }else{
            return 1;
        }
    }
    
}
