package org.neos.cxf.rest.service;

import javax.ws.rs.core.Response;

import org.neos.cxf.rest.model.User;
import org.neos.cxf.rest.ws.IUserRestService;

public class UserRestServiceImpl implements IUserRestService{

	@Override
	public Response getUserDetail(String userId) {
		System.out.println("ENTRANDO AL SERVICIO::"); 
		
		User user = new User("HUGO","HIDALGO","hhugohm@gmail.comm");
		
		return Response.status(Response.Status.OK).entity(user).build();
	}

}
