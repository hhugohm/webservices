package org.neos.cxf.rest.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 
 * This is interface for the employee services
 *
 */
//@Path("/")
//@WebService(name="employeeService", targetNamespace="http://www.lessonslab.com/cxf-rest/example")
@Path("/service/employees")
public interface CxfRestService 
{
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	//@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getemployeedetail")
	public Response getEmployeeDetail(@QueryParam("employeeId") String employeeId);
	
}
