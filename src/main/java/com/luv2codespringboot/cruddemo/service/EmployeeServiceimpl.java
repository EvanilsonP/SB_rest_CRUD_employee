package com.luv2codespringboot.cruddemo.service;

import com.luv2codespringboot.cruddemo.dao.EmployeeRepository;
import com.luv2codespringboot.cruddemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceimpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceimpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);
        Employee theEmployee = null;
        if(result.isPresent()) {
            theEmployee = result.get();
        } else {
            throw new RuntimeException("Could not find employee id: " + theId);
        }

        return theEmployee;
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {

        return employeeRepository.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {

        employeeRepository.deleteById(theId);
    }
}
