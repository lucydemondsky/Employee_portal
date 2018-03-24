package com.xl.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
*@author xl
*@version  1.0
**/


@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String salary;
	private Date hiredate;
	private String email;
	private String phone;

	public Employee() {

	}

	public Employee(String name, String salary, Date hireDate, String email, String phone) {
		super();
		this.name = name;
		this.salary = salary;
		this.hiredate = hireDate;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	public Date getHireDate() {
		return hiredate;
	}

	public void setHireDate(Date hireDate) {
		this.hiredate = hireDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", hiredate=" + hiredate + ", email="
				+ email + ", phone=" + phone + "]";
	}
	
	

}
