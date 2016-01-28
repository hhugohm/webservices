package org.neos.cxf.rest.ws;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

/**
 * Esta clase muestra el funcionamiento de un servicio REST get con path <br>
 * /service/user ademas de consumir y producir cadenas JSON
 * @author hector.hidalgo
 *
 */
@Path("/service/user")
public interface IUserRestService {
	
	/**
	 * Este metodo devuelve la informacion de un usuario en cadena JSON
	 * @param userId es el parametro que viene en la peticion
	 * @return regresa una cadena json con la info de un usuario
	 */
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getuserdetail")
	public Response getUserDetail(@QueryParam("userId") String userId);
	
	

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/files/download/{fileName}")
	@Produces({"application/pdf"})
	public Response downloadFile(@Context HttpServletRequest request,
									@PathParam("fileName") String fileName);
	
	
	@POST
	@Path("/files/upload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadFile(Attachment attachment, 
										@Context HttpServletRequest request);
	@GET
	@Path("/files/image")
	@Produces({"image/png", "image/jpg", "image/gif"})
	public Response getFullImage(@Context HttpServletRequest request,
									@PathParam("fileName") String fileName);

	
}
