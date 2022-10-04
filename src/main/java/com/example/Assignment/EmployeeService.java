package com.example.Assignment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee save(Employee employee)
	{
		return employeeRepository.save(employee);
	}
		
	public Employee readById(Integer id)
	{
		return employeeRepository.findById(id).get();
	}
	
	public Iterable<Employee> readAll()
	{
		return employeeRepository.findAll();
	}
	public Employee update(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	public void delete(Integer id)
	{
		employeeRepository.deleteById(id);
	}
	

}
