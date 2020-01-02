package com.deloitte.java.entity;
import java.time.LocalDate;
public class Employee 
{
  LocalDate doj;
	int empid;
	String ename;
	double salary;
	public Employee() {}
	public Employee(int empid, String ename, double salary)
	{
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		System.out.println();
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
