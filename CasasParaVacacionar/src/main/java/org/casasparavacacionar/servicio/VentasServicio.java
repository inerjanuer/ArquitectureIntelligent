/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.casasparavacacionar.servicio;

import java.util.List;
import org.casasparavacacionar.modelo.RegistroVentaSensores;
import org.casasparavacacionar.modelo.Usuario;

/**
 *
 * @author Inerjanuer
 */
public class VentasServicio {
    
    private final UsuarioServicio usuarioServicio = new UsuarioServicio();
    
    public List<RegistroVentaSensores> getVentasUsuario(int usuarioId){
        return usuarioServicio.getUsuario(usuarioId).getVentas();
    }
    
    public RegistroVentaSensores getVenta(int usuarioId, int ventaId){
        List<RegistroVentaSensores> ventas = usuarioServicio.getUsuario(usuarioId).getVentas();
        for(RegistroVentaSensores venta : ventas){
            if(venta.getId() == ventaId){
                return venta;
            }
        }
        return null;
    }
    
    public RegistroVentaSensores addVenta(int usuarioId, RegistroVentaSensores venta){
        Usuario usuario  = usuarioServicio.getUsuario(usuarioId);
        venta.setId(getMaximo(usuario));
        usuario.getVentas().add(venta);
        return venta;
    }
    
    public RegistroVentaSensores updateVenta(int usuarioId, RegistroVentaSensores venta){
        Usuario usuario = new UsuarioServicio().getUsuario(usuarioId);
        int posicion  = getPosicion(usuario, venta.getId());
        try {
            usuario.getVentas().set(posicion, venta);
        } catch (IndexOutOfBoundsException ioobe) {
            return null;
        }
        return venta;
    }
    
    public void deleteVenta(int usuarioId, int ventaId){
        Usuario usuario = new UsuarioServicio().getUsuario(usuarioId);
        int posicion = getPosicion(usuario, ventaId);
        usuario.getVentas().remove(posicion);
    }

    private int getMaximo(Usuario usuario) {
        int size = usuario.getVentas().size();
        if(size>0){
            return usuario.getVentas().get(size - 1  ).getId()+1;
        }
        return 1;
    }

    private int getPosicion(Usuario usuario, int id) {
        List<RegistroVentaSensores> venta = usuario.getVentas();
        for(int i=0; i<venta.size(); i++){
            if(venta.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
    
}
