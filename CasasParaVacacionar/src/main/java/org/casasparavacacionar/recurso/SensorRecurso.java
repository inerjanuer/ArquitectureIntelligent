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
import org.casasparavacacionar.modelo.Sensor;
import org.casasparavacacionar.servicio.SensorServicio;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/sensores")
public class SensorRecurso {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    SensorServicio servicio = new SensorServicio();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Sensor> getSensores(@QueryParam("nombre") String nombre) {
        if(nombre != null && nombre.length()> 0){
            return servicio.getNombreSensor(nombre);
        }
        return servicio.getSensores();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Sensor getSensor(@PathParam("id") int id) {
        return servicio.getSensor(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Sensor addSensor(Sensor sensor){
        return servicio.addSensor(sensor);
    }
    
    @DELETE
    @Path("/{id}")
    public void deleteSensor(@PathParam("id")int id){
        servicio.deleteSensor(id); 
    }
    
    @PUT
    @Path("/{sensorId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Sensor updateSensor(@PathParam("sensorId") int id, Sensor sensor){
        sensor.setId(id);
        return servicio.updateSensor(sensor);
    }
}
