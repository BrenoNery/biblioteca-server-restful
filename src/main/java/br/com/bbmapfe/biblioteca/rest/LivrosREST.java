package br.com.bbmapfe.biblioteca.rest;

import java.util.*;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.bbmapfre.biblioteca.bussiness.LivroService;
import br.com.bbmapfre.biblioteca.model.Livro;

@Path("/")
public class LivrosREST {
	
	@Inject
	LivroService livroService;
	
	@GET
	@Path("livros")
	@Produces(MediaType.APPLICATION_JSON)
    public List<Livro> consultarLivros() {
		return livroService.consultarLivros();
    }
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("livros")
	public Response adicionarLivroFormPost(Livro livro) {
		
		System.out.println("id " + livro.getId());
		System.out.println("nome " + livro.getNome());
		
		return Response.status(Status.CREATED).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("livros")
	public Response adicionarLivroFormPut(Livro livro) {
		
		System.out.println("Livro adicionado com sucesso ..." + livro.getId());
		System.out.println("Livro adicionado com sucesso ..." + livro.getNome());
		
		return Response.status(Status.ACCEPTED).build();
	}
	
    @DELETE
    @Path("livros/{id}")
    public Response deletarLivroPorId(@PathParam("id") String id) {
    	System.out.println("deletando livro.... " + id);
    	return Response.status(Status.OK).build();
    }
    
    /*
     * A forma abaixo serve para passar o id por JSON
     * Exemplo: { "id":1 }
     */
    /*
    @DELETE
    @Path("livros/id")
    public Response deletarLivroPorId(String id) {
    	System.out.println("deletando livro.... " + id);
    	return Response.status(Status.OK).build();
    }
    */
}
