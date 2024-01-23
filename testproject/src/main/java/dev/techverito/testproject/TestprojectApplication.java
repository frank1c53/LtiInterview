package dev.techverito.testproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dev.techverito.testproject.model.Address;
import dev.techverito.testproject.model.Employee;
import dev.techverito.testproject.service.EmployeeService;
import dev.techverito.testproject.serviceimpl.EmployeeServiceImpl;

@SpringBootApplication
public class TestprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestprojectApplication.class, args);
		
		List<String> cities = new ArrayList<>();
		cities.add("Mumbai");
		
	
		EmployeeService employeeService = new EmployeeServiceImpl();
		//employeeService.getData(cities);
		System.out.println(employeeService.getData(cities));
		
		
		
	
		
		
	}
	
	
	
	public static List<Employee> getEmployees(){
		Address ad1 = new Address(1,101,"Mumbai");
		Address ad2 = new Address(2,102,"Pune");
		Address ad3 = new Address(3,103,"Kolkata");
		Address ad4 = new Address(4,104,"Delhi");
		List<Address> add1 = new ArrayList<>();
		add1.add(ad1);
		
		List<Address> add2 = new ArrayList<>();
		add2.add(ad1);
		add2.add(ad4);
		
		List<Address> add3 = new ArrayList<>();
		add3.add(ad1);
		add3.add(ad4);
		add3.add(ad3);
		/*
		 * Employee e = new Employee(101,"Frank",add1);
		 * 
		 * Employee e1 = new Employee(102,"Shreya",add2); Employee e2 = new
		 * Employee(103,"Vidisha",add3);
		 */
		
		
        Employee e = new Employee(101,"Frank","Mumbai");
		
		Employee e1 = new Employee(102,"Shreya","Hyderabad");
		Employee e2 = new Employee(103,"Vidisha","Pune");
		
		List<Employee> empList = new ArrayList<>();
		empList.add(e);
		empList.add(e1);
		empList.add(e2);
		
		return empList;
	}

}
