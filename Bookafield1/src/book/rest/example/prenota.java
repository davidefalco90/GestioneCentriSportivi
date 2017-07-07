package book.rest.example;

import javax.ws.rs.GET;

import javax.ws.rs.Path;

import javax.ws.rs.PathParam;

import javax.ws.rs.core.Response;

@Path("/prenota")
public class prenota{
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg){
		
		String output = "Welcome to Word of REST :"+msg;
		return Response.status(200).entity(output).build();
	}
	
}