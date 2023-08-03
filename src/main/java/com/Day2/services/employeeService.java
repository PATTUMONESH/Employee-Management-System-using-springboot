package com.Day2.services;

import java.util.List;

import com.Day2.entity.Employee;

public interface employeeService {
	public void addEmployee(Employee emp);
	public void updateEmployee(Employee emp,int empid);
	public void deleteEmployee(int empid);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int empid);
	

}
