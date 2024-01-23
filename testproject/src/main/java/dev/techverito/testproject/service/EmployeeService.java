package dev.techverito.testproject.service;

import java.util.List;

import dev.techverito.testproject.model.Employee;

public interface EmployeeService {

	public List<Employee> getData(List<String> cities);
}
