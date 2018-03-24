package com.xl.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xl.demo.model.Employee;
import com.xl.demo.repository.EmployeeRepository;
/**
*@author xl
*@version  1.0
**/
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getEmployeeList(String sortColumn, String sortOrder) {
		List<Employee> res = new ArrayList<Employee>();
		if (sortColumn.equalsIgnoreCase("name")) {
			res = sortOrder.equalsIgnoreCase("asc") ? employeeRepository.findAllByOrderByNameAsc()
					: employeeRepository.findAllByOrderByNameDesc();
		} else if (sortColumn.equalsIgnoreCase("hiredate")) {
			res = sortOrder.equalsIgnoreCase("asc") ? employeeRepository.findAllByOrderByHiredateAsc()
					: employeeRepository.findAllByOrderByHiredateDesc();
		} else if (sortColumn.equalsIgnoreCase("salary")) {
			res = sortOrder.equalsIgnoreCase("asc") ? employeeRepository.findAllByOrderBySalaryAsc()
					: employeeRepository.findAllByOrderBySalaryDesc();
		}

		return res;
	}

	public Employee getEmployee(String name) {
		return employeeRepository.findByName(name);
	}


}
