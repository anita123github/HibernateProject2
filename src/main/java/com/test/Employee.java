 package com.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
@Id
@Column (name="name")	
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Column (name="fullname")
private String FullName;
@Column (name="address")
private String address;
@Column (name="salary")
private long salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFullName() {
	return FullName;
}
public void setFullName(String fullName) {
	FullName = fullName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", FullName=" + FullName + ", address=" + address + ", salary=" + salary + "]";
}

}
