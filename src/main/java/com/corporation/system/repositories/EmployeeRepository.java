package com.corporation.system.repositories;

import com.corporation.system.entities.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
