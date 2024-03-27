package com.luv2codespringboot.cruddemo.dao;

import com.luv2codespringboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
