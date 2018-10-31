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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.casasparavacacionar.modelo.Usuario;
import org.casasparavacacionar.servicio.UsuarioServicio;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/usuarios")
public class UsuarioRecurso {

    /**
     * Method handling HTTP GET requests. The returned object will be sent to
     * the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    UsuarioServicio servicio = new UsuarioServicio();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> getUsuarios(@QueryParam("user") String nombre) {
        if (nombre != null && nombre.length() > 0) {
            return servicio.getNombreUsuario(nombre);
        }
        return servicio.getUsuarios();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario getUsuario(@PathParam("id") int id) {
        return servicio.getUsuario(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario addUsuario(Usuario usuario) {
        return servicio.addUsario(usuario);
    }

    @DELETE
    @Path("/{id}")
    public void deleteUsuario(@PathParam("id") int id) {
        servicio.deleteUsuario(id);
    }

    @PUT
    @Path("/{usuarioId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario updateUsuario(@PathParam("usuarioId") int id, Usuario usuario) {
        usuario.setId(id);
        return servicio.updateUsuario(usuario);
    }

    @Path("/{usuarioId}/adicionar")
    public AdicionRecurso getAdiciones() {
        return new AdicionRecurso();
    }
}
