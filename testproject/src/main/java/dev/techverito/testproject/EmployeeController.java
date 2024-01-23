package dev.techverito.testproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.techverito.testproject.model.Employee;
import dev.techverito.testproject.service.EmployeeService;

@RestController("/api/employee")
public class EmployeeController {

	
	/*
	 * @Autowired EmployeeService employeeService;
	 * 
	 * @GetMapping("/{city}") List<Employee> getData(@RequestParam List<String>
	 * cities) { List<Employee> empList = employeeService.getData(cities);
	 * 
	 * return empList; }
	 */
	
}
