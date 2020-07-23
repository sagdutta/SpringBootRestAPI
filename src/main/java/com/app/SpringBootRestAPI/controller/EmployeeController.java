package com.app.SpringBootRestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.SpringBootRestAPI.entity.Employee;
import com.app.SpringBootRestAPI.service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/allEmployee")
	public List<Employee> getAllEmployee() {
		System.out.println("EMPLOYEE: "+employeeService.getAllEmployee());
		return employeeService.getAllEmployee();
	}
}
