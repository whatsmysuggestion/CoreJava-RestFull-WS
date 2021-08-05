package com.wms.sample;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/sarvanan")
public class Hitesh
{

	
	@GET
	@Path("/parminderGet")
	public Response sayHello()
	{
		String str="<h1><center>Hello Welcome Get</center></h1>";
		
		return Response.status(Status.SERVICE_UNAVAILABLE).entity(str).build();
		  
	}
	
	
	@GET
	@Path("/greater/{a}/{b}")
	public Response great(@PathParam("a") int m,@PathParam("b") int n)
	{
		
		if(m>n)
		{
			String str="<h1><center>A is greater</center></h1>";
			return Response.status(Status.OK).entity(str).build();
		}
		else
			
		{
			String str="<h1><center>B is greater</center></h1>";
			return Response.status(Status.NOT_FOUND).entity(str).build();
			
		}
		
		
		  
	}
	
	
	@POST
	@Path("/bigger")
	public Response big(@FormParam("a") int m,@FormParam("b") int n)
	{
		
		if(m>n)
		{
			String str="<h1><center>A is Big</center></h1>";
			return Response.status(Status.OK).entity(str).build();
		}
		else
			
		{
			String str="<h1><center>B is Big</center></h1>";
			return Response.status(Status.NOT_FOUND).entity(str).build();
			
		}
		
		
		  
	}
	
	

	@GET
	@Path("/larger")
	public Response large(@MatrixParam("a") int m,@MatrixParam("b") int n)
	{
		
		if(m>n)
		{
			String str="<h1><center>A is Larger</center></h1>";
			return Response.status(Status.OK).entity(str).build();
		}
		else
			
		{
			String str="<h1><center>B is Larger</center></h1>";
			return Response.status(Status.NOT_FOUND).entity(str).build();
			
		}
		
		
		  
	}
	
	
	@GET
	@Path("/greaterQuery")
	public Response great2(@QueryParam("a") int m,@QueryParam("b") int n)
	{
		
		if(m>n)
		{
			String str="<h1><center>A is greater</center></h1>";
			return Response.status(Status.OK).entity(str).build();
		}
		else
			
		{
			String str="<h1><center>B is greater</center></h1>";
			return Response.status(Status.NOT_FOUND).entity(str).build();
			
		}
		
		
		  
	}
	
	
	@POST
	@Path("/parminderPost")
	public String sayHello1()
	{
		return "Hello Welcome Post";
	}
	
	
	@PUT
	@Path("/parminderPut")
	public String sayHello2()
	{
		return "Hello Welcome Put";
	}
	
	
	@DELETE
	@Path("/parminderDel")
	public String sayHello3()
	{
		return "Hello Welcome Delete";
	}
	
	
	
}
