package com.wms.sample;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/prepaid")
public class GarimaExample {

	/*
	 * @GET public String getName() { return "Prepaid Connection Registerd"; }
	 * 
	 * 
	 * 
	 * @POST
	 * 
	 * @Path("/getData") public String getData() { return
	 * "Prepaid Details Reterived"; }
	 * 
	 * @DELETE
	 * 
	 * @Path("/deleteDetails") public String deleteDetails() { return
	 * "Prepaid Details Deleted"; }
	 * 
	 * 
	 * @PUT
	 * 
	 * @Path("/updateDetails") public String updateDetails() { return
	 * "Prepaid Details Updated"; }
	 */

	/*
	 * @GET
	 * 
	 * @Path("/insert/{eno}/{ename}/{esal}") public Response
	 * getData(@PathParam("eno") int no, @PathParam("ename") String
	 * name,@PathParam("esal") float sal) {
	 * 
	 * if(name.length()>5) return
	 * Response.status(200).entity("Eno Is:- "+no+"  Ename Is:- "
	 * +name+"   Esalary:- "+sal).build(); else return
	 * Response.status(400).entity("<font color=red>Invalid Input</font>").build();
	 * 
	 * }
	 */

	/*
	 * @GET
	 * 
	 * @Path("/insert") public Response getData(@QueryParam("eno") int
	 * no, @QueryParam("ename") String name,@QueryParam("esal") float sal) {
	 * 
	 * if(name.length()>5) return
	 * Response.status(200).entity("Eno Is:- "+no+"  Ename Is:- "
	 * +name+"   Esalary:- "+sal).build(); else return
	 * Response.status(400).entity("<font color=red>Invalid Input</font>").build();
	 * 
	 * }
	 */

	/*
	 * @GET
	 * 
	 * @Path("/insert") public Response getData(@MatrixParam("eno") int
	 * no, @MatrixParam("ename") String name,@MatrixParam("esal") float sal) {
	 * 
	 * if(name.length()>5) return
	 * Response.status(200).entity("Eno Is:- "+no+"  Ename Is:- "
	 * +name+"   Esalary:- "+sal).build(); else return
	 * Response.status(400).entity("<font color=red>Invalid Input</font>").build();
	 * 
	 * }
	 */

	/*
	 * @POST
	 * 
	 * @Path("/insert") public Response getData(@FormParam("eno") int
	 * no, @FormParam("ename") String name,@FormParam("esal") float sal) {
	 * 
	 * if(name.length()>5) return
	 * Response.status(200).entity("Eno Is:- "+no+"  Ename Is:- "
	 * +name+"   Esalary:- "+sal).build(); else return
	 * Response.status(400).entity("<font color=red>Invalid Input</font>").build();
	 * 
	 * }
	 */

	/*
	 * @POST
	 * 
	 * @Path("/insert")
	 * 
	 * @Consumes("application/json")
	 * 
	 * @Consumes({MediaType.APPLICATION_JSON}) public Response getData(Employee ee)
	 * {
	 * 
	 * if(ee.getEname().length()>5) return
	 * Response.status(200).entity("Eno Is:- "+ee.getEno()+"  Ename Is:- "+ee.
	 * getEname()+"   Esalary:- "+ee.getEsal()).build(); else return
	 * Response.status(400).entity("<font color=red>Invalid Input</font>").build();
	 * 
	 * }
	 */

	@POST
	@Path("/insert")
	/* @Consumes("application/json") */
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getData(Employee ee) {

		if (ee.getEname().length() > 5)
			return Response.status(200).entity(
					"Eno Is:- " + ee.getEno() + "  Ename Is:- " + ee.getEname() + "   Esalary:- " + ee.getEsal())
					.build();
		else
			return Response.status(400).entity("<font color=red>Invalid Input</font>").build();

	}

}
