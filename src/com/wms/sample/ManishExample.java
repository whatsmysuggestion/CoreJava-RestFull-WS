package com.wms.sample;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/Mail")
public class ManishExample
{

	@GET
	@Path("/inbox")
	public String inbox()
	{
		return "Inbox";
	}
	
	

	  @POST	  
	  @Path("/formData") 
	  public Response formExample(@FormParam("eno") int no,@FormParam("ename") String name,@FormParam("esal") float sal)
	  {
	  
	  if(name.length()>5)
		  return Response.status(404).entity("<h1><font color=red>Invalid Input</font></h1>").build(); 
	  else 
		  return Response.status(200).entity("Eno:- "+no+"  Name:-"+name+"  Salary"+sal).build(); 
	  }
	  
	
	
	
	  @GET	  
	  @Path("/getData/{eno}/{ename}/{esal}") 
	  public Response select(@PathParam("eno") int no,@PathParam("ename") String name,@PathParam("esal") float sal)
	  {
	  
	  if(name.length()>5)
		  return Response.status(404).entity("<h1><font color=red>Invalid Input</font></h1>").build(); 
	  else 
		  return Response.status(200).entity("Eno:- "+no+"  Name:-"+name+"  Salary"+sal).build(); 
	  }
	  
	  
	  @GET	  
	  @Path("/queryData") 
	  public Response queryExamples(@QueryParam("eno") int no,@QueryParam("ename") String name,@QueryParam("esal") float sal)
	  {
	  
	  if(name.length()>5)
		  return Response.status(404).entity("<h1><font color=red>Invalid Input</font></h1>").build(); 
	  else 
		  return Response.status(200).entity("Eno:- "+no+"  Name:-"+name+"  Salary"+sal).build(); 
	  }
	 
	  @GET	  
	  @Path("/matrixData") 
	  public Response matrixData(@MatrixParam("eno") int no,@MatrixParam("ename") String name,@MatrixParam("esal") float sal)
	  {
	  
	  if(name.length()>5)
		  return Response.status(404).entity("<h1><font color=red>Invalid Input</font></h1>").build(); 
	  else 
		  return Response.status(200).entity("Eno:- "+no+"  Name:-"+name+"  Salary"+sal).build(); 
	  }
	
	@GET
	@Path("/inboxRS")
	public Response inboxWithRes()
	{
		return Response.status(405).entity("<font color=green>Inbox With Respose</font>").build();
	}
	
	@POST
	@Path("/outbox")
	public String outbox()
	{
		return "outbox";
	}
	
	
	@PUT
	@Path("/sent")
	public String sent()
	{
		return "<h1><center>sent</center></h1>";
	}
	
	
	
	@DELETE
	@Path("/spam")
	public String spam()
	{
		return "spam";
	}
	
	
}
