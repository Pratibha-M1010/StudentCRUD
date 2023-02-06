package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Repository.StudentRepository;
import com.app.pojos.Student;
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
@Autowired
private StudentRepository stuRepo;
	@Override
	public Student findByEmailAndPassword(String email, String password) {
		
		return stuRepo.findByEmailAndPassword(email, password);
	}

	@Override
	public Student addStudent(Student st) {
		
		return stuRepo.save(st);
	}

	@Override
	public String deleteStudent(Long id) {
		stuRepo.deleteById(id);
		return "deleted Successfully";
	}

}
