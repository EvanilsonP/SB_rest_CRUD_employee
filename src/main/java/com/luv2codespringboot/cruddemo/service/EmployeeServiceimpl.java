package com.luv2codespringboot.cruddemo.service;

import com.luv2codespringboot.cruddemo.dao.EmployeeDAO;
import com.luv2codespringboot.cruddemo.dao.EmployeeDAOjpaimpl;
import com.luv2codespringboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceimpl implements EmployeeService{
    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceimpl(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
