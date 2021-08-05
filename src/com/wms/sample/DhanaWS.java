package com.wms.sample;

import java.io.File;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
 

@Path("/Dhana")
public class DhanaWS {

	
	
	
	@GET 
	@Path("/data")
	@Produces(MediaType.APPLICATION_OCTET_STREAM) // text/html
	public Response getData()
	{ 
		String Fp="E:\\sample.pdf";
		File f=new File(Fp);
		
		
		ResponseBuilder res=Response.ok((Object) f);
		res.header("Content-Disposition","attachment; filename=\"dummy.pdf\"");
		
		return res.build();
		 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	  @GET	  
	  @Path("/insert/{eno}/{ename}/{esal}") 
	  public Response  getData(@PathParam("eno") int no, @PathParam("ename") String  name,@PathParam("esal") float sal) {
	  
	  if(name.length()>5) 
		  return Response.status(Status.OK).entity("Eno Is:- "+no+"  Ename Is:- "  +name+"   Esalary:- "+sal).build(); 
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
		 
		  
}
