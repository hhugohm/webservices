package org.neos.cxf.rest.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataHandler;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import lombok.extern.slf4j.Slf4j;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
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

	@SuppressWarnings("unused")
	@Override
	public Response downloadFile(HttpServletRequest request, String fileName) {
		String relativePath=File.separator+"files"+File.separator+fileName;
		String downloadPath = 
				request.getServletContext().getRealPath("")+ relativePath;
		log.info("path: "+ downloadPath);
		File file = null;
		file= new File( downloadPath);
		if ( file !=null ) {
			log.info("ENTRANDO AL SERVICIO - downloadFile+.. ");
			ResponseBuilder response = Response.ok((Object) file);
			response.header("Content-Disposition", 
									"attachment; filename="+fileName.trim());
			return response.build();
		} else {
			return Response.status(
								Response.Status.CONFLICT).entity(null).build(); 
			}
	}

	@Override
	public Response uploadFile(Attachment attachment, HttpServletRequest request) {
		String relativePath=File.separator+"upload"+File.separator;
		
		DataHandler handler = attachment.getDataHandler();
		MultivaluedMap<String, String> map = attachment.getHeaders();
		String fileName = getFileName(map);
		relativePath += fileName;
		
		String uploadPath = 
				request.getServletContext().getRealPath("")+ relativePath;
		
		log.info("path: "+ uploadPath);
		
		OutputStream out;
		try {
			out = new FileOutputStream(new File(uploadPath));
			InputStream stream = handler.getInputStream();
			int read = 0;
			byte[] bytes = new byte[1024];
			while ((read = stream.read(bytes)) != -1) {
				out.write(bytes, 0, read);
			}
			stream.close();
			out.flush();
			out.close();
		} catch (IOException e) {
		log.error("ERROR",e);
		return Response.status(Response.Status.CONFLICT).
											entity("File Not Uploaded").build();
		}
		
		return Response.status(Response.Status.OK).
												entity("File Uploaded").build();
	}
	
	private String getFileName(MultivaluedMap<String, String> header) {
		String[] contentDisposition = 
							header.getFirst("Content-Disposition").split(";");
		for (String filename : contentDisposition) {
			if ((filename.trim().startsWith("filename"))) {
				String[] name = filename.split("=");
				String exactFileName = name[1].trim().replaceAll("\"", "");
				return exactFileName;
			}
		}
		return "unknown";
	}

}
