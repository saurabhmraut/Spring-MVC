package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
@Column(name="name")
 private String name;
 @Id
 @Column(name="id")
 private int id;
 
 @Column(name="salary")
 private int salary;
 
 
 public Employee() {
	 super();
 }
 
public Employee(String name, int id, int salary) {
	super();
	this.name = name;
	this.id = id;
	this.salary = salary;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
 
	
	
	
}
