package com.wms.sample;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
 

@Path("/SivaWS")
public class RobinWS 
{

	
	
	
	
	
	@GET
	@Path("/Sum")
	public Response add(@QueryParam("a") int a, @QueryParam("b") int b)
	{
		if(b==0)
			return Response.status(404).entity("Cannot Perform Division").build();
		else
		{
		int c=a+b;		
		return Response.status(200).entity("Sum="+c).build();
		}
		
	}
	
	
	

	
	@GET
	@Path("/Add")
	public Response addi(@MatrixParam("a") int a, @MatrixParam("b") int b)
	{
		if(b==0)
			return Response.status(404).entity("Cannot Perform Division").build();
		else
		{
		int c=a+b;		
		return Response.status(200).entity("Sum="+c).build();
		}
		
	}
	
	
	@POST
	@Path("/div")
	public Response div(@FormParam("a") int a, @FormParam("b") int b)
	{
		if(b==0)
			return Response.status(404).entity("Cannot Perform Division").build();
		else
		{
		int c=a+b;		
		return Response.status(200).entity("Sum="+c).build();
		}
		
	}
	
	
	
	@GET
	@Path("/Addition/{a}/{b}")
	public Response sum(@PathParam("a") int a, @PathParam("b") int b)
	{
		if(b==0)
			return Response.status(404).entity("Cannot Perform Division").build();
		else
		{
		int c=a/b;		
		return Response.status(200).entity("Sum="+c).build();
		}
		
	}

	@GET	
	@Path("/")
	public String displayHi1()
	{
		return "<h1>Home Page</h1>";
	}
	
	@GET	
	@Path("/veena")
	public String displayHi2()
	{
		return "Hi Welcome GET";
	}
	
	@POST	
	@Path("/veena")
	public String displayHi3()
	{
		return "Hi Welcome POST";
	}
	
	@PUT	
	@Path("/veena")
	public String displayHi4()
	{
		return "Hi Welcome PUT";
	}
	
	@DELETE	
	@Path("/veena")
	public String displayHi5()
	{
		return "Hi Welcome DELETE";
	}
}
