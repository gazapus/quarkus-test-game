package org.acme;

import org.jboss.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

	private static final Logger LOG = Logger.getLogger(GreetingResource.class.toString());

	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        LOG.info("hola prueba sí");
		return "Hello from RESTEasy Reactive";
    }
}