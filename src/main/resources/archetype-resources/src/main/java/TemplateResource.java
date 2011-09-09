package ${package};

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class TemplateResource {

  @GET
  @Produces("text/plain")
  @Path("/hello")
  public String getHello() {
    return "Hello World";
  }

  @GET
  @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  @Path("/{param}")
  public TemplateMessage getTemplateMessage(@PathParam("param") String param) {
    return new TemplateMessage(param);
  }

}
