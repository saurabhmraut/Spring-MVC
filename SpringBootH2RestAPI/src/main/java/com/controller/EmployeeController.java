package com.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.repo.EmployeeRepo;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	@GetMapping(path="/Employees")
	public List<Employee> allEmployees(){
		ArrayList<Employee> list= new ArrayList<Employee>();
	Iterator<Employee>	it=repo.findAll().iterator();
	while(it.hasNext()) 
		list.add(it.next());
		return list;
	}
	@GetMapping(path="/Employee/{id}")
	public Employee getEmployee(@PathVariable int id){
		return repo.findById(id).get();
		
	}
	@PostMapping(path="addEmployee")
	public void insertEmployee(@RequestBody Employee employee) {
		repo.save(employee);
		
	}
	
	@PutMapping(path="updateEmployee")
	public void updateEmployee(@RequestBody Employee employee) {
		repo.save(employee);
	}
		
	@DeleteMapping(path="/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable int id){
		 repo.deleteById(id);
		
	}
		
	}


