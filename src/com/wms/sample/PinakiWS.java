package com.wms.sample;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
 
import javax.ws.rs.core.Response.Status;
 

@Path("/pinaki")
public class PinakiWS {

	
	
	
	@POST
	@Path("/div")
	public Response div(@FormParam("a") int a,@FormParam("b") int b)
	{
		
		
		if(b==0)
			return Response.status(Status.BAD_REQUEST).entity("Invalid Input").build();
		else {
			Integer res=a/b;
			return Response.status(Status.OK).entity(""+res).build();
			}
		}
	
	
	
	@GET
	public Response display()
	{
		
		String str="Home Page";
		return Response.status(Status.OK).entity(str).build();
	}
	
	@POST
	@Path("/about")
	public String about()
	{
		return "About Page";
	}
	
	
	@DELETE
	@Path("/contact")
	public String contact()
	{
		return "Contact Page";
	}
	
	@PUT
	@Path("/help")
	public String help()
	{
		return "Help Page";
	}
}
