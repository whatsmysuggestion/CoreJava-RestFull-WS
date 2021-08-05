package com.wms.sample;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
 

@Path("/Rachana")
public class RachanaWS {

	
	
	
	  @GET
	  
	  @Path("/insert/{eno}/{ename}/{esal}") 
	  public Response  getData(@PathParam("eno") int no, @PathParam("ename") String  name,@PathParam("esal") float sal) {
	  
	  if(name.length()>5) 
		  return Response.status(200).entity("Eno Is:- "+no+"  Ename Is:- "  +name+"   Esalary:- "+sal).build(); 
	  else 
		  return Response.status(400).entity("<font color=red>Invalid Input</font>").build();
	  
	  }
	 
	
	
	
	@GET
	@Path("/addition/{a}/{b}")
	public String addition(@PathParam("a") int a,@PathParam("b") int b)
	{
		return "Result "+(a+b);
	}
	
	@GET
	@Path("/mul") 
	public String getData(@QueryParam("a") int a, @QueryParam("b")int b) {
		
		return "Result "+(a*b);
	}
	
	
	  @GET
	  @Path("/div")
	  public String getDiv(@MatrixParam("a") int a, @MatrixParam("b") int b) {
	  
			return "Result "+(a/b);
	  }
	 
	  
		
		  @POST
		  @Path("/subb") 
		  public String subtra(@FormParam("a") int a, @FormParam("b") int b) {
		  
			  return "Result "+(a-b);
		  
		  }
		 
	
	
	@GET
	public String display()
	{
		return "Hello Welcome";
	}
	

	@GET
	@Path("/GetTest")
	public String display1()
	{
		return "Hello Welcome GET";
	}
	
	@POST
	@Path("/PosttTest")
	public String display2()
	{
		return "Hello Welcome POST";
	}
	
	@PUT
	@Path("/PuttTest")
	public String display3()
	{
		return "Hello Welcome PUT";
	}
	
	@DELETE
	@Path("/DeleteTest")
	public String display4()
	{
		return "Hello Welcome DELETE";
	}
	
	
}
