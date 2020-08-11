package com.testproject.hrservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testproject.hrservice.models.Employee;
import com.testproject.hrservice.models.EmployeesList;

@RestController
@RequestMapping("/hr")
public class HrResources {
	
	List<Employee> employees = Arrays.asList(
			new Employee("E1", "Mahima", "Mahajan", "MedTech"),
			new Employee("E2", "Akshay", "Negi", "Surgery")
		);
	
	@RequestMapping("/employees")
	public EmployeesList getEmployees() {
		
		EmployeesList employeesList = new EmployeesList();
		employeesList.setEmployees(employees);		
		return employeesList;
	}
	
	@RequestMapping("/employees/{Id}")
	public Employee getEmployeeById(@PathVariable("Id") String Id) {
		Employee e = employees.stream()
				.filter(employee ->Id.equals(employee.getId()))
				.findAny()
				.orElse(null);
		return e;
	}
}
