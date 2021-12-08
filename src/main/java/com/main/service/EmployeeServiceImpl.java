package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Employee;
import com.main.repository.EmployeeRepo;

/**
 * @author SAB
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;

	public EmployeeServiceImpl(EmployeeRepo empRepo) {
		super();
		this.empRepo = empRepo;
	}

	@Override
	public Employee createEmployee(Employee employee) {

		return empRepo.save(employee);
	}

	@Override
	public List<Employee> readEmployee() {

		return empRepo.findAll();
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {

		Employee newEmp = empRepo.findById(id).get();
		newEmp.setFname(employee.getFname());
		newEmp.setLname(employee.getLname());
		newEmp.setEmail(employee.getEmail());
		newEmp.setPassword(employee.getPassword());
		return empRepo.save(newEmp);
	}

	@Override
	public void deleteById(int id) {

		empRepo.deleteById(id);
	}

}
