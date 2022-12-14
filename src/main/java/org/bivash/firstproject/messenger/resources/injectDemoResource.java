package org.bivash.firstproject.messenger.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriInfo;

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class injectDemoResource {
	
	@GET
	@Path("/annotations")
	public String getParamsUsingAnnotations(@MatrixParam("param")String matrixParam,
											@HeaderParam("authSessionID")String header,
											@CookieParam("name")String cookie) {
		return "Matrix param:" + matrixParam + "Header Param:" + header + "Cookie" + cookie;
	}
	
	@GET
	@Path("context")
	public String getParamsUsingContext(@Context UriInfo uriInfo, @Context HttpHeaders headers ) {
		
		String path = uriInfo.getAbsolutePath().toString();
		String cookies = headers.getCookies().toString();
		return "path :" + path + "Cookies:" + cookies;
	}

}
