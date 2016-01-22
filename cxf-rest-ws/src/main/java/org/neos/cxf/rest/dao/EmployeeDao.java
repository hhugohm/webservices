package org.neos.cxf.rest.dao;

import org.neos.cxf.rest.model.Employee;

public class EmployeeDao {

	public Employee getEmployeeDetails(String employeeId) {
		Employee emp = new Employee();
		emp.setDateOfJoining("01-02-2001");
		emp.setDepartment("Sales");
		emp.setEmail("test@example.com");
		emp.setEmployeeId("675436");
		emp.setFirstName("HUGO");
		emp.setLastName("HIDALGO");
		return emp;
	}
}
