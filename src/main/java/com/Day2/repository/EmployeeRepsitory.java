package com.Day2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Day2.entity.Employee;


public interface EmployeeRepsitory extends JpaRepository<Employee,Integer> {

}
