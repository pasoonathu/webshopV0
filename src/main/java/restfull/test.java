package restfull;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/tests")
public class test {
	ResponseBuilder rb = null;
		
	@GET
	@RolesAllowed("guest")
	@Produces("text/html")
	public Response testing() {
    String s = "t werkte joepie";
    rb = Response.status(200).entity(s);
    return rb.build();
	

//    return s;
	}

	
}