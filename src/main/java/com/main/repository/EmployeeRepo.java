package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Employee;

/**
 * @author SAB
 *
 */

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
