package com.app.SpringBootRestAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.SpringBootRestAPI.Dao.EmployeeDao;
import com.app.SpringBootRestAPI.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getAllEmployee() {
		System.out.println("EMPLOYEE: "+employeeDao.findAll().toString());
		return employeeDao.findAll();
	}

}
