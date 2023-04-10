package com.UST.dockerEmployee.service;

import com.UST.dockerEmployee.entity.Employee;
import com.UST.dockerEmployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public Employee createEmployee(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> getEmployee() {
        return repo.findAll();
    }

    public Employee getEmployeeById(Long id) {

        return repo.findById(id).orElse(null);
    }
    public String deleteEmployeeById(Long id) {
        repo.deleteById(id);
        return "the employee information is deleted";
    }

    }

