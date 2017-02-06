package br.com.dev.biblioteca.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.dev.biblioteca.model.Autor;

@Path("/")
public class AutoresREST {

	@GET
	@Path("autores")
	@Produces(MediaType.APPLICATION_XML)
	public List<Autor> consultarAutores() {		
		return null;
	}
}
