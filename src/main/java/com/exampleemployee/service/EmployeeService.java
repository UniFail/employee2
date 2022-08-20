package com.exampleemployee.service;

import com.exampleemployee.demain.Employee;

import java.util.List;

public interface EmployeeService {

    Employee findEmployee(String firstname, String lastname);

    Employee addEmployee(String firstname, String lastname);

    Employee deleteEmployee(String firstname, String lastname);
    List<Employee> getAll();
}
