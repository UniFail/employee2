package com.exampleemployee.service;

import com.exampleemployee.BadReqest;
import com.exampleemployee.demain.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImlp implements EmployeeService {
        private static final int LIMIT = 10;
        private final List<Employee> employees;


        public EmployeeServiceImlp() {
            this.employees = new ArrayList<>();
        }

        public Employee findEmployee(String firstname, String lastname)  {
            Employee employee = new Employee(firstname,lastname);
            if(!employees.contains(employee)){

            }
            return employee;
        }

        public Employee addEmployee(String firstname, String lastname) throws BadReqest {
            Employee employee = new Employee(firstname, lastname);
            if (firstname.matches("^[a-zA-Z]*$") && lastname.matches("^[a-zA-Z]*$")) {
                employees.add(employee);
                return employee;
            }
            else
               throw  new BadReqest("400 Bad Request.");
        }

        public Employee deleteEmployee(String firstname, String lastname) {
            Employee employee = new Employee(firstname, lastname);
            if (employees.contains(employee)) {
                employees.remove(employee);

            }
            return employee;
        }
        public List<Employee> getAll(){
            return new ArrayList<>(employees);
        }
    }
