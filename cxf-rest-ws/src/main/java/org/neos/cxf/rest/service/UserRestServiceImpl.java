package org.neos.cxf.rest.service;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import lombok.extern.slf4j.Slf4j;
import org.neos.cxf.rest.model.User;
import org.neos.cxf.rest.ws.IUserRestService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserRestServiceImpl implements IUserRestService{

	@Override
	public Response getUserDetail(String userId) {
		log.info("ENTRANDO AL SERVICIO - getUserDetail.. ");
		
		User user = new User("HUGO","HIDALGO","hhugohm@gmail.comm");
		
		return Response.status(Response.Status.OK).entity(user).build();
	}

	@Override
	public Response downloadFile(HttpServletRequest request, String fileName) {
		String relativePath=File.separator+"files"+File.separator+fileName;
		String uploadPath = 
				request.getServletContext().getRealPath("")+ relativePath;
		log.info("path: "+ uploadPath);
		File file = null;
		file= new File( uploadPath);
		if ( file !=null ) {
			log.info("ENTRANDO AL SERVICIO - downloadFile.. ");
			ResponseBuilder response = Response.ok((Object) file);
			response.header("Content-Disposition", 
									"attachment; filename="+fileName.trim());
			return response.build();
		} else {
			return Response.status(
								Response.Status.CONFLICT).entity(null).build(); 
			}
	}

}
