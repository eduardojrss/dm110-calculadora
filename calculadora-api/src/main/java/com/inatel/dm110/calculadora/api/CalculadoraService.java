package com.inatel.dm110.calculadora.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public interface CalculadoraService {
	
	@GET
	@Path("/sum/{first}/{second}")
	@Produces(MediaType.APPLICATION_JSON)
	Result sum(@PathParam("first") Double first, @PathParam("second") Double second);
	
	@POST
	@Path("/sub")
	@Produces(MediaType.APPLICATION_JSON)
	Result sub(@FormParam("first") Double first, @FormParam("second") Double second);
}
