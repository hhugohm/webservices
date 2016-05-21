package org.neos.cxf.rest.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataHandler;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.neos.cxf.rest.model.User;
import org.neos.cxf.rest.ws.IUserRestService;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

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
		log.info("ENTRANDO AL SERVICIO WEB UPLOAD FILE.. git mario");
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

	@Override
	public Response getFullImage(HttpServletRequest request, String fileName) {
		log.info("EN EL SERVICIO IMAGE...");
		
		String relativePath=File.separator+"images"+File.separator+ "minions.jpg";
		String fullPath = 
				request.getServletContext().getRealPath("")+ relativePath;
		
		FileInputStream fileInputStream=null;
        File file = new File(fullPath);
        byte[] bFile = new byte[(int) file.length()];
       
       
	    try {
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile);
			fileInputStream.close();
		} catch (IOException  e) {
			e.printStackTrace();
		}
	    return Response.ok(bFile).build();
	    //String mt = new MimetypesFileTypeMap().getContentType(file);
       
	    //return Response.ok(bFile,mt).build();
	}
	
	/*	File file = new File(fullPath);
    ResponseBuilder response = Response.ok((Object) file);
    response.header("Content-Disposition", "attachment; filename=test.png");
    log.info("Termina...");
    return response.build();*/
	/*
	log.info("image: "+fullPath);
	File file = new File(fullPath);
  String mediaType = SomeContentTypeMapHere(file);
  return Response.ok(file,mediaType).build();*/

	
	/*Image  img = new ImageIcon(fullPath).getImage();

  BufferedImage bufferedImage = new BufferedImage(img.getWidth(null), img.getHeight(null),
      BufferedImage.OPAQUE);

  ByteArrayOutputStream baos = new ByteArrayOutputStream();
  try {
		ImageIO.write(bufferedImage, "png", baos);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
  byte[] imageData = baos.toByteArray();

// return Response.ok(imageData.toByteArray()).build();
  //return Response.ok(new ByteArrayInputStream(imageData)).build();
  log.info("TERMINO..");
 
  return Response.ok(imageData).build();*/
	

}
