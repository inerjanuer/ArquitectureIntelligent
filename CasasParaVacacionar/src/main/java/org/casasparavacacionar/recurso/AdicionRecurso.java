/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.casasparavacacionar.recurso;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.casasparavacacionar.modelo.RegistroAdicionSensores;
import org.casasparavacacionar.servicio.AdicionServicio;

/**
 *
 * @author Inerjanuer
 */
@Path("/")
public class AdicionRecurso {
    
    AdicionServicio servicio = new AdicionServicio();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<RegistroAdicionSensores> getAdiciones(@PathParam("usuarioId")int id){
        return servicio.getAdicionesUsuario(id);
    }
    
    @GET
    @Path("{adicionId}")
    @Produces(MediaType.APPLICATION_JSON)
    public RegistroAdicionSensores getAdicion(@PathParam("usuarioId")int id,
                                          @PathParam("adicionId") int ventaid){
        return servicio.getAdicion(id, ventaid);
    }    
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public RegistroAdicionSensores addAdicion (@PathParam("usuarioId")int id , RegistroAdicionSensores venta){
        return servicio.addAdicion(id, venta);
    }
    
    @PUT
    @Path("{adicionId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public RegistroAdicionSensores updateAdicion (@PathParam("usuarioId")int id, 
                                              @PathParam("adicionId") int ventaId ,
                                              RegistroAdicionSensores venta){
        venta.setId(ventaId);
        return servicio.updateAdicion(id, venta);
    }
    
    @DELETE
    @Path("{adicionId}")
    public void deleteAdicion (@PathParam("usuarioId") int userId, @PathParam("adicionId") int ventaId){
        servicio.deleteAdicion(userId, ventaId);
    }
}
