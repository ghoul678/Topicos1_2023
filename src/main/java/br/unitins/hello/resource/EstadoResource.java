package br.unitins.hello.resource;

import java.util.List;

import br.unitins.hello.model.Estado;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/estados")
public class EstadoResource {

    @GET // Identificar ao navegador o que é pedido
    @Produces(MediaType.APPLICATION_JSON) // Para produzir uma saida
    public List<Estado> todosEstados() {
        return Estado.listAll();
    }
}
