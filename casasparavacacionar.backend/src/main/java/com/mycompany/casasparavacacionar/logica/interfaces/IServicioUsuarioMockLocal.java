/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casasparavacacionar.logica.interfaces;

import com.mycompany.casasparavacacionar.dto.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Inerjanuer
 */
@Local
public interface IServicioUsuarioMockLocal {
    
    public void agregarUsuario(Usuario usario);
    
    public List<Usuario> darUsuarios();
    
    
}
