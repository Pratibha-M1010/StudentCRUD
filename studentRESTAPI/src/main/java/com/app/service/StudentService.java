package com.app.service;

import com.app.pojos.Student;

public interface StudentService {
public Student findByEmailAndPassword(String email,String password);
public Student addStudent(Student st);
public String deleteStudent(Long id);
}
