package br.com.dev.biblioteca.rest;

import java.security.Key;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.dev.biblioteca.model.Login;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

public class LoginREST {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("login")
	public Response logar(Login login){
		if (login.getLogin().equals("pedrinho") && login.getPassword().equals("123")) {
			
			Key key = MacProvider.generateKey();

			String compactJws = Jwts.builder()
			  .setSubject("Joe")
			  .signWith(SignatureAlgorithm.HS512, key)
			  .compact();
			
			return Response.ok().header("jwt", compactJws).build();
		} else {
			return Response.status(Status.FORBIDDEN).build();
		}
	}
}
