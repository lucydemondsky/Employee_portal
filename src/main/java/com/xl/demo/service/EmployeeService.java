package com.xl.demo.service;

import java.util.List;

import com.xl.demo.model.Employee;

/**
*XXX
*@author xl
*@version  1.0
**/
public interface EmployeeService {
	public List<Employee> getEmployeeList(String sortColumn, String sortOrder);
	public Employee getEmployee(String name);
	
}
