package com.main.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Employee;
import com.main.service.EmployeeService;

/**
 * @author SAB
 *
 */
@RestController
public class EmployeeController {

	private EmployeeService empService;

	public EmployeeController(EmployeeService empService) {
		super();
		this.empService = empService;
	}

	@PostMapping("/createEmp")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {

		return new ResponseEntity<Employee>(empService.createEmployee(employee), HttpStatus.OK);
	}

	@GetMapping("/readAllEmp")
	public List<Employee> readAllEmployees() {

		return empService.readEmployee();
	}

	@PutMapping("{id}")
	public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {

		return empService.updateEmployee(id, employee);
	}

	@DeleteMapping("{id}")
	public String deleteEmployee(@PathVariable("id") int id) {

		empService.deleteById(id);
		return "Deleted ID: " + id;
	}
}
