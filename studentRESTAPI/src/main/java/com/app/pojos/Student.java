package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student extends BaseEntity {
@Column(length=20)
	private String name;
@Column(length=20)
private String email;
@Column(length=10,nullable=false)
private String password;
@Column(length=20)
private String location;
private double marks;



public Student() {
	super();
}
public Student(String name, String location, double marks) {
	super();
	this.name = name;
	this.location = location;
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return  "Student Id" + getId() +" [name=" + name + ", location=" + location + ", marks=" + marks + "]";
}

}
