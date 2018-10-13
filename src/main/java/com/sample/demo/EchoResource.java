package com.sample.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path(EchoResource.V1_ECHO)
public class EchoResource {

	static final String V1_ECHO = "v1/echo";

	@GET
	@Produces("text/plain")
	public String echo(@QueryParam("m") String message) {
		return "echo: " + message;
	}
}
