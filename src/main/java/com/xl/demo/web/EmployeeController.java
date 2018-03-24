package com.xl.demo.web;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.jboss.jandex.Main;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xl.demo.model.Employee;
import com.xl.demo.service.EmployeeServiceImpl;

/**
*@author xl
*@version  1.0
**/
@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeService;
	
	@RequestMapping("/getlist")
	@ResponseBody
	@CrossOrigin
	public List<Employee> getList(@RequestParam("sortColumn") String sortColumn, @RequestParam("sortOrder") String sortOrder) {
		List<Employee> res = employeeService.getEmployeeList(sortColumn, sortOrder);;
		return res;
	}
	
	@RequestMapping("/")
	public String direct() {
		return "index.html";
	}
	
	@RequestMapping("/getEm")
	@ResponseBody
	@CrossOrigin
	public Employee getEmployee(@RequestParam("name") String name) {
		Employee em = employeeService.getEmployee(name);
		System.out.println(em);
		return em;
	}
	
}
