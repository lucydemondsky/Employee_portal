package com.xl.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xl.demo.model.Employee;

/**
*@author xl
*@version  1.0
**/
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findAllByOrderByNameAsc();

	public List<Employee> findAllByOrderByNameDesc();

	public List<Employee> findAllByOrderByHiredateAsc();

	public List<Employee> findAllByOrderByHiredateDesc();

	public List<Employee> findAllByOrderBySalaryAsc();

	public List<Employee> findAllByOrderBySalaryDesc();
	
	public Employee findByName(String name);
	
	
	
}
