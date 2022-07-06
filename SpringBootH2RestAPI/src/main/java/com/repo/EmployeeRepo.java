package com.repo;

import org.springframework.data.repository.CrudRepository;

import com.model.Employee;

public interface EmployeeRepo  extends CrudRepository<Employee,Integer>{

}
