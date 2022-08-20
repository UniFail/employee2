package com.exampleemployee.controller;

import com.exampleemployee.demain.Employee;
import com.exampleemployee.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @GetMapping("/find")
    public Employee findEmployee(String firstname, String lastname) {

        return employeeService.findEmployee(firstname,lastname);
    }

    @GetMapping(path = "/add")
    public Employee addEmployee(String firstname, String lastname) {
        return employeeService.addEmployee(firstname,lastname);
    }

    @GetMapping(path = "/delete")
    public Employee deleteEmployee(String firstname, String lastname) {

        return employeeService.deleteEmployee(firstname,lastname);

    }
    @GetMapping
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
}