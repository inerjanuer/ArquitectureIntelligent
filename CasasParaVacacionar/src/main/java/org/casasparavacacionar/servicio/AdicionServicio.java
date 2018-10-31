/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.casasparavacacionar.servicio;

import java.util.List;
import org.casasparavacacionar.modelo.RegistroAdicionSensores;
import org.casasparavacacionar.modelo.Usuario;

/**
 *
 * @author Inerjanuer
 */
public class AdicionServicio {

    private final UsuarioServicio usuarioServicio = new UsuarioServicio();

    public List<RegistroAdicionSensores> getAdicionesUsuario(int usuarioId) {
        return usuarioServicio.getUsuario(usuarioId).getAdicion();
    }

    public RegistroAdicionSensores getAdicion(int usuarioId, int ventaId) {
        List<RegistroAdicionSensores> ventas = usuarioServicio.getUsuario(usuarioId).getAdicion();
        for (RegistroAdicionSensores venta : ventas) {
            if (venta.getId() == ventaId) {
                return venta;
            }
        }
        return null;
    }

    public RegistroAdicionSensores addAdicion(int usuarioId, RegistroAdicionSensores venta) {
        Usuario usuario = usuarioServicio.getUsuario(usuarioId);
        venta.setId(getMaximo(usuario));
        usuario.getAdicion().add(venta);
        return venta;
    }

    public RegistroAdicionSensores updateAdicion(int usuarioId, RegistroAdicionSensores venta) {
        Usuario usuario = new UsuarioServicio().getUsuario(usuarioId);
        int posicion = getPosicion(usuario, venta.getId());
        try {
            usuario.getAdicion().set(posicion, venta);
        } catch (IndexOutOfBoundsException ioobe) {
            return null;
        }
        return venta;
    }

    public void deleteAdicion(int usuarioId, int ventaId) {
        Usuario usuario = new UsuarioServicio().getUsuario(usuarioId);
        int posicion = getPosicion(usuario, ventaId);
        usuario.getAdicion().remove(posicion);
    }

    private int getMaximo(Usuario usuario) {
        int size = usuario.getAdicion().size();
        if (size > 0) {
            return usuario.getAdicion().get(size - 1).getId() + 1;
        }
        return 1;
    }

    private int getPosicion(Usuario usuario, int id) {
        List<RegistroAdicionSensores> venta = usuario.getAdicion();
        for (int i = 0; i < venta.size(); i++) {
            if (venta.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

}
