package com.wms.sample;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

 

@Path("/Limu")
public class LimuExample 
{

	@GET
	@Path("/First")
	public Response display()
	{
		return Response.status(404).entity("Hello GET").build();
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
	
	
	
	@POST
	@Path("/FirstPost")
	public String postDisplay()
	{
		return "Hello POST";
	}
	
	
	@PUT
	@Path("/FirstPut")
	public String putDisplay()
	{
		return "Hello Put";
	}
	
	@DELETE
	@Path("/FirstDelete")
	public String deleteDisplay()
	{
		return "Hello Delete";
	}
	
}
