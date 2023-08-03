package com.Day2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Day2.entity.Employee;
import com.Day2.services.employeeService;

@RestController
public  class employeeController {
	@Autowired
	employeeService empService;
	
	
	public employeeService getEmpService() {
		return empService;
	}
	public void setEmpService(employeeService empService) {
		this.empService = empService;
	}
	@GetMapping("/employee")
	public List<Employee>getAllEmployees() {
		return empService.getAllEmployee();
	}
	@PostMapping("/employeeadd")
	public void addEmployee(Employee emp)
	{
		empService.addEmployee(emp);
	}
	@PutMapping("/employee/{empid}")
	public void updateEmployee(@RequestBody Employee emp,@PathVariable int empid)
	{
		empService.updateEmployee(emp, empid);
	}
	@DeleteMapping("/employee/{empid}")
	public void deleteEmployee(@PathVariable int empid)
	{
		empService.deleteEmployee(empid);
	}
	@GetMapping("/employee/{empid}")
	public Employee getEmployee(int empid) {
		return empService.getEmployeeById(empid);
		
	}
	

}
