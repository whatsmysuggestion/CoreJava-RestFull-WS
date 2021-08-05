package com.wms.sample;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/WSExample")
public class RSExample {
	
	
	@GET
	public String HomePage()
	{
		
		return "Home Page";
	}

	
	
	@POST
	@Path("/insert")
	public String insert()
	{
		return "Insert Page";
	}
	
	@DELETE
	@Path("/delete")
	public String delete()
	{
		return "Delete Page";
	}
	@PUT
	@Path("/update")
	public String update()
	{
		return "Update Page";
	}
	
	@POST
	@Path("/alter")
	public Response alter(@FormParam("eno") int eno,@FormParam("ename")  String ename,@FormParam("esal") float esal )
	{
		if(ename.length()>5)
		return Response.status(200).entity("Employee Details Are no:-"+eno+"  name:-"+ename+"  esal="+esal).build();
		else
		return Response.status(404).entity("Invalid Input").build();	
	}
	
	@GET
	@Path("/drop")
	public String drop()
	{
		return "Drop Page";
	}
}
