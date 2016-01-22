package org.neos.cxf.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;


@Data
@XmlRootElement(name = "employee")
public class Employee {
	private String firstName;
	private String lastName;
	private String employeeId;
	private String email;
	private String dateOfJoining;
	private String department;
}
