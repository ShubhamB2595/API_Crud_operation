package com.main.service;

import java.util.List;

import com.main.model.Employee;

/**
 * @author SAB
 *
 */
public interface EmployeeService {

	public Employee createEmployee(Employee employee);

	public List<Employee> readEmployee();

	public Employee updateEmployee(int id, Employee teacher);

	public void deleteById(int id);

}
