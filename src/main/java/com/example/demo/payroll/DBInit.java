package com.example.demo.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.example.demo.payroll.Employee;
import com.example.demo.payroll.EmployeeRepository;

public class DBInit implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        String firstName = "Tom";
        String lastName = "M";
        String name = firstName + lastName;
        String role = "Admin";

        Employee tom = new Employee(firstName, lastName, name, role);
        tom = employeeRepository.save(tom);

    }
}
