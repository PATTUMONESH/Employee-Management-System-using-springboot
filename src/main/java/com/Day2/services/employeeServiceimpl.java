package com.Day2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Day2.entity.Employee;
import com.Day2.repository.EmployeeRepsitory;
@Service

public class employeeServiceimpl implements employeeService{
	@Autowired
	EmployeeRepsitory employeeRepository;
	
	

	
   
	public EmployeeRepsitory getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepsitory employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public void addEmployee(Employee emp) {
		employeeRepository.save(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp, int empid) {
		employeeRepository.save(emp);
		
	}

	@Override
	public void deleteEmployee(int empid) {
		employeeRepository.deleteById(empid);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int empid) {
		
		return employeeRepository.findById(empid).get();
	}

}
