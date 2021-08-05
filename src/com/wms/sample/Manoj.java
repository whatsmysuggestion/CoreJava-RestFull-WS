package com.wms.sample;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.Status;
 

@Path("/rahman")
public class Manoj 
{
	
	@POST
	public String hello()
	{
		return "<h1><center>HELLO Welcome</center></h1>";
	}
	
	
	@POST
	@Path("/second")
	public Response hi()
	{
		return Response.status(Status.OK).entity("<h1><center>Hi HRU</center></h1>").build();
	}

	@POST
	@Path("/add")
	public Response addition(@FormParam("a") int x,@FormParam("b") int y)
	{
		int c=x+y;
		return Response.status(Status.OK).entity("<h1><center>SUM="+c+"</center></h1>").build();
	}
	
}
