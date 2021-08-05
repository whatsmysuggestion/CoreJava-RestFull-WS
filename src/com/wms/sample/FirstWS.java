package com.wms.sample;

import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.jersey.api.client.ClientResponse.Status;
 
 

 
@Path("/DBO")
public class FirstWS {

	
	EmployeeDAO empDao;
	
	public FirstWS() {
	  empDao=new EmployeeDAO();
	}
	
	@GET
	@Path("/empDetails")
	@Produces(MediaType.APPLICATION_JSON)
	public Map<String,Employee> getEmpDetails()
	{
		return empDao.getEmployees();
	}
	
	
	
		
	/*
	 * @GET public Response insert(@MatrixParam("eno") int no,@MatrixParam("ename")
	 * String name,@MatrixParam("esal") float sal) {
	 * 
	 * 
	 * //DB Code
	 * 
	 * // return
	 * "Details Collectected  Eno:-  "+no+" Ename:- "+name+"  Esalay:-"+sal;
	 * if(name.trim().length()!=0||name!=null) return
	 * Response.status(Status.OK).entity("Details Collectected  Eno:-  "
	 * +no+" Ename:- "+name+"  Esalay:-"+sal).build(); else return
	 * Response.status(Status.PARTIAL_CONTENT).
	 * entity("Name Length Is Less Than 5 characters ").build();
	 * 
	 * }
	 */
	
	
	/*
	 * @POST
	 * 
	 * @Path("/create") public String insert() { return "Table Created"; }
	 */
	/*
	 * @DELETE
	 * 
	 * @Path("/delete") public String delete() { return "Record Deleted"; }
	 * 
	 * @PUT
	 * 
	 * @Path("/update") public String update() { return "Record Updated"; }
	 * 
	 * 
	 * @GET
	 * 
	 * @Path("/select") public String select() { return "Records Selected"; }
	 */
	
}
