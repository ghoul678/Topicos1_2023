package br.unitins.hello.resource;



import java.util.List;

import br.unitins.hello.model.Biblia;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/consulta")
public class BibliaResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Biblia> todos(){
        return Biblia.listAll();

    } 
}
