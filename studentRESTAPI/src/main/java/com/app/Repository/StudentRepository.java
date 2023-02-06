package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
Student findByEmailAndPassword(String email,String password);
}
