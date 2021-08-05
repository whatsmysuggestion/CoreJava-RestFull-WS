package com.wms.sample;
import javax.ws.rs.*;
import java.io.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/WMS")
public class DisplayData {
	
  

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
}
