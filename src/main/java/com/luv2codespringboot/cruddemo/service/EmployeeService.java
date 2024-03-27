package com.luv2codespringboot.cruddemo.service;

import com.luv2codespringboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
