package com.corporation.system.services;

import java.util.ArrayList;
import java.util.List;

import com.corporation.system.dtos.EmployeeDto;
import com.corporation.system.entities.Employee;
import com.corporation.system.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository empRepository;

    public List<EmployeeDto> getAllEmployees() {
     
        List<Employee> employeeList = empRepository.findAll();
        List<EmployeeDto> employeeListDto = new ArrayList<>();

        for(Employee e: employeeList) {
            EmployeeDto dto = new EmployeeDto(e.getId(), e.getName(), e.getRole());
            employeeListDto.add(dto);
        }

        return employeeListDto;
    }

}
