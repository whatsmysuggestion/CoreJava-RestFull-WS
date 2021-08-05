package com.wms.sample;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
 

@Path("/ukesh")
public class UkeshExample {
	
	/*
	 * @GET public String getName() { return "Hello Welcome"; }
	 * 
	 */
	
	
	
	/*
	 * @GET
	 * 
	 * @Path("/getData/{eno}/{ename}/{esal}") public Response
	 * select(@PathParam("eno") int no,@PathParam("ename") String
	 * name,@PathParam("esal") float sal) {
	 * 
	 * if(name.length()>5) return
	 * Response.status(404).entity("<h1><font color=red>Invalid Input</font></h1>").
	 * build(); else return
	 * Response.status(200).entity("Eno:- "+no+"  Name:-"+name+"  Salary"+sal).build
	 * (); }
	 */
	
	
	
	
	@POST
	@Path("/getData")
	public Response select(@FormParam("eno") int no,@FormParam("ename") String name,@FormParam("esal") float sal)
	{
		
		if(name.length()>5)
		return Response.status(404).entity("<h1><font color=red>Invalid Input</font></h1>").build();
		else			
		return Response.status(200).entity("Eno:- "+no+"  Name:-"+name+"  Salary"+sal).build();
	}
	
	
	
	
	/*
	 * @GET
	 * 
	 * @Path("/getData") public Response select(@QueryParam("eno") int
	 * no,@QueryParam("ename") String name,@QueryParam("esal") float sal) {
	 * 
	 * if(name.length()>5) return
	 * Response.status(404).entity("<h1><font color=red>Invalid Input</font></h1>").
	 * build(); else return
	 * Response.status(200).entity("Eno:- "+no+"  Name:-"+name+"  Salary"+sal).build
	 * (); }
	 */
	
	
	
	/*
	 * @GET
	 * 
	 * @Path("/getData") public String select() { return "Hello getData"; }
	 */
	
	/*
	 * @POST
	 * 
	 * @Path("/insertData") public String insert() { return "Hello Insert"; }
	 * 
	 * 
	 * 
	 * @PUT
	 * 
	 * @Path("/updateData") public String update() { return "Hello Update"; }
	 * 
	 * 
	 * @DELETE
	 * 
	 * @Path("/deleteData") public String delete() { return "Hello Delete"; }
	 */
	
	
	
	

}
