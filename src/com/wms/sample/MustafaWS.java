package com.wms.sample;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
 

@Path("/Mustafa")
public class MustafaWS {

	
	
	  @GET
	  
	  @Path("/insert/{eno}/{ename}/{esal}") 
	  public Response  getData(@PathParam("eno") int no, @PathParam("ename") String  name,@PathParam("esal") float sal) {
	  
	  if(name.length()>5) 
		  return Response.status(200).entity("Eno Is:- "+no+"  Ename Is:- "  +name+"   Esalary:- "+sal).build(); 
	  else 
		  return Response.status(400).entity("<font color=red>Invalid Input</font>").build();
	  
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
	@Path("/")
	public String saySomeThing()
	{
		return "Home";
	}
	
	
	@GET
	@Path("/sample")
	public Response saySample()
	{
		return Response.status(Status.OK).entity("Hello Welcome").build(); 
	}
	
	
	@GET
	@Path("/first")
	public String first()
	{
		return "Hello first";
	}
	
	@POST
	@Path("/second")
	public String second()
	{
		return "Hello second";
	}
	
	@PUT
	@Path("/third")
	public String third()
	{
		return "Hello third";
	}
	
	@DELETE
	@Path("/four")
	public String four()
	{
		return "Hello four";
	}
}
