package com.app.SpringBootRestAPI.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.SpringBootRestAPI.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
