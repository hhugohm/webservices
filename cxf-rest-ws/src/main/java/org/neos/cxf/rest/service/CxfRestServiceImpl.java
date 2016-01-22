package org.neos.cxf.rest.service;

import javax.ws.rs.core.Response;

import org.neos.cxf.rest.dao.EmployeeDao;
import org.neos.cxf.rest.ws.CxfRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CxfRestServiceImpl implements CxfRestService {
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Response getEmployeeDetail(String employeeId) {
		System.out.println("ENTRANDO AL SERVICIO EMPLEADO REST");
		if (employeeId == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		// return Response.status(Response.Status.OK).entity(users).build();
		// return
		// Response.ok.(employeeDao.getEmployeeDetails(employeeId)).build();

		return Response.status(Response.Status.OK).entity(employeeDao.getEmployeeDetails(employeeId)).build();
	}
}
