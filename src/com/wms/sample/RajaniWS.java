package com.wms.sample;

import javax.ws.rs.GET;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
 

@Path("/rajani")
public class RajaniWS 
{
	
	@GET
	@Path("/getName")
	public Response getName(@QueryParam("name") String name,@QueryParam("no") int no)
	{
		String res="My name Is  "+name+" No Is:- "+no;
		if(name.length()>5)
		return Response.status(Status.OK).entity(res).build();
		else
		return Response.status(Status.BAD_REQUEST).entity("Invalid Input").build();	
	}

}
