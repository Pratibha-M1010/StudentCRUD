package com.app.StudentDTO;

public class StudentDto {
private String email;
private String password;
public String getEmail() {
	return email;
}

public StudentDto(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}

public StudentDto() {
	super();
}

public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
