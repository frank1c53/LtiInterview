package dev.techverito.testproject.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import dev.techverito.testproject.TestprojectApplication;
import dev.techverito.testproject.model.Employee;
import dev.techverito.testproject.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public List<Employee> getData(List<String> cities) {
		// TODO Auto-generated method stub
		
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList = TestprojectApplication.getEmployees();
		
		List<Employee> filteredCityEmployees = employeeList.stream().filter(e->e.City().equals("Mumbai")).collect(Collectors.toList());
		
		
		return filteredCityEmployees;
		
		
	}
	
}
