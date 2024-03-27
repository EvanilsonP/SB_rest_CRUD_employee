package com.luv2codespringboot.cruddemo.dao;

import com.luv2codespringboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeDAOjpaimpl implements EmployeeDAO{
    // define field for entity manager
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public EmployeeDAOjpaimpl(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }
}
