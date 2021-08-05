package com.wms.sample;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
 

@Path("/lakshmi")
public class Mubeen 
{

	@GET
	public String getData()
	{
		return "Hello Welcome Default";
	}
	
	
	@GET
	@Path("/GetStatus")
	public Response getData5()
	{
		return Response.status(200).entity("<font color=green>Hello Welcome</font>").build();
	}
	
	
	@GET
	@Path("/GetRes")
	public String getData1()
	{
		return "Hello Welcome Get";
	}
	
	
	@POST
	@Path("/PostRes")
	public String getData2()
	{
		return "Hello Welcome Post";
	}
	
	
	@PUT
	@Path("/PutRes")
	public String getData3()
	{
		return "Hello Welcome Put";
	}
	
	@DELETE
	@Path("/DeleteRes")
	public String getData4()
	{
		return "Hello Welcome Delete";
	}
	
	
	@GET
    @Path("/insert/{eno}/{ename}/{esal}") 
	public Response getData(@PathParam("eno") int no, @PathParam("ename") String name,@PathParam("esal") float sal)
	{
	   
	    if(name.length()>5) 
	    	return  Response.status(200).entity("Eno Is:- "+no+"  Ename Is:- "+name+"   Esalary:- "+sal).build(); 
	    else 
	    	return Response.status(400).entity("<font color=red>Invalid Input</font>").build();
	   
	  }
	
	@GET
    @Path("/insertData") 
	public Response getData6(@QueryParam("eno") int no, @QueryParam("ename") String name,@QueryParam("esal") float sal)
	{
	   
	    if(name.length()>5) 
	    	return  Response.status(200).entity("Eno Is:- "+no+"  Ename Is:- "+name+"   Esalary:- "+sal).build(); 
	    else 
	    	return Response.status(400).entity("<font color=red>Invalid Input</font>").build();
	   
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
	
	
	
}
