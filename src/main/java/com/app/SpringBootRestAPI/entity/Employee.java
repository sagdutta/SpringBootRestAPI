package com.app.SpringBootRestAPI.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")

public class Employee {

	@Id
	@Column(name = "Emp_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_sequence")
	@SequenceGenerator(name = "test_sequence", sequenceName = "hibernate_sequence", allocationSize = 1)
	private Long empId;
	@Column(name = "Emp_Name")
	private String name;
	@Column(name = "Emp_Desig")
	private String designation;

	public Employee() {

	}

	public Employee(Long empId, String name, String designation) {

		this.empId = empId;
		this.name = name;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + "]";
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
