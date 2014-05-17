package sk.blahunka.jbossinject.example;

import sk.blahunka.jbossinject.properties.SystemProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("example")
public class ExampleResource {

	@Inject
	@SystemProperty("example.foo")
	String foo;

	@Inject
	@SystemProperty("example.bar")
	String bar;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String printSomeSystemProperties() {
		return "foo=" + foo + ", bar=" + bar;
	}

}
