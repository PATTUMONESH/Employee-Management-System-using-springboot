package com.Day2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@Column(name="Emp_Id")
	private int empid;
	@Column(name="Emp_Name")
	private String empname;
	@Column(name="Emp_Department")
	private String deptname;
	
	public Employee(int empid, String empname, String deptname) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.deptname = deptname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public Employee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	

}
