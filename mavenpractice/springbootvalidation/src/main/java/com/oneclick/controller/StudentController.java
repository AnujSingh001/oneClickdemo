package com.oneclick.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oneclick.model.Student;

@RestController
public class StudentController {

	@PostMapping("/students")
	public ResponseEntity<String> registerStudent(@RequestBody Student student) {
		
		return new ResponseEntity<String>("Student Saved Successfully "+student.getName(),HttpStatus.CREATED);
		
	}
}
