package com.corporation.system.controllers;

import java.util.List;

import com.corporation.system.dtos.EmployeeDto;
import com.corporation.system.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeService empService;

    @GetMapping()
    public ResponseEntity<List<EmployeeDto>> getEmployees() {
        List<EmployeeDto> employeeList = this.empService.getAllEmployees();

        return ResponseEntity.ok(employeeList);
    }
}
