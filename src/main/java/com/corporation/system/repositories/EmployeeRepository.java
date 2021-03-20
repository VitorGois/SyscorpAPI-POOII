package com.corporation.system.repositories;

import java.util.ArrayList;
import java.util.List;

import com.corporation.system.entities.Employee;

import org.springframework.stereotype.Component;

@Component()
public class EmployeeRepository {
    
    public List<Employee> getAllEmployees() {

        Employee e1 = new Employee();
        e1.setId(1l);
        e1.setName("João Paulo");
        e1.setRole("Developer JR.");
        e1.setSalary(2500.00);

        Employee e2 = new Employee();
        e2.setId(2l);
        e2.setName("Ana Maria");
        e2.setRole("UX Designer SR.");
        e2.setSalary(4000.00);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);

        return employeeList;

    }

}
