package org.neos.cxf.rest.service;

import javax.ws.rs.core.Response;

import lombok.extern.slf4j.Slf4j;
import org.neos.cxf.rest.model.User;
import org.neos.cxf.rest.ws.IUserRestService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserRestServiceImpl implements IUserRestService{

	@Override
	public Response getUserDetail(String userId) {
		log.info("ENTRANDO AL SERVICIO - ");
		
		User user = new User("HUGO","HIDALGO","hhugohm@gmail.comm");
		
		return Response.status(Response.Status.OK).entity(user).build();
	}

}
