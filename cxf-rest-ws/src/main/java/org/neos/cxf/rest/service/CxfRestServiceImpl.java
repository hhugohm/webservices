package org.neos.cxf.rest.service;

import javax.ws.rs.core.Response;

import lombok.extern.slf4j.Slf4j;
import org.neos.cxf.rest.dao.EmployeeDao;
import org.neos.cxf.rest.ws.CxfRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CxfRestServiceImpl implements CxfRestService {
    @Autowired
    private EmployeeDao employeeDao;
    //comentario

    @Override
    public Response getEmployeeDetail(String employeeId) {
        log.info("CAMBIO DESDE MASTER..");
        log.info("CAMBIO DESDE hotfix/cxf_rs_uploadservice..");
        log.info("ENTRANDO AL SERVICIO EMPLEADO REST-CAMBIO");
        
        
        if (employeeId == null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        // return Response.status(Response.Status.OK).entity(users).build();
        // return
        // Response.ok.(employeeDao.getEmployeeDetails(employeeId)).build();

        return Response.status(Response.Status.OK).entity(employeeDao.getEmployeeDetails(employeeId)).build();
    }
}
