package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.app.pojos.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService stuService;
	
@GetMapping("/student")
public Student getStudent(@RequestParam String email,@RequestParam String password)
{
	return stuService.findByEmailAndPassword(email, password);
}

@PostMapping("/student/add")

public Student addStudent(@RequestBody Student st)
{
	return stuService.addStudent(st);
}

@DeleteMapping("/student/{id}")

public String deleteStudentById(@PathVariable Long id )
{
 stuService.deleteStudent(id);
	return "success delete";
}
}

