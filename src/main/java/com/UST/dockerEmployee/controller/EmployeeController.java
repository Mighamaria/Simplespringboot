package com.UST.dockerEmployee.controller;

import com.UST.dockerEmployee.entity.Employee;
import com.UST.dockerEmployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/reg")
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @PostMapping("/addemp")
    public Employee addEmployee(@RequestBody Employee employee )
    {
        return service.createEmployee(employee);
    }
    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return  service.getEmployee();
    }
    @GetMapping("/{id}")
    public Employee getAllEmployee(@PathVariable Long id){
        return  service.getEmployeeById(id);
    }
    @DeleteMapping("/deleteemployee/{id}")
    public String deleteEmployee(@PathVariable Long id)
    {
        return service.deleteEmployeeById(id);
    }
}
