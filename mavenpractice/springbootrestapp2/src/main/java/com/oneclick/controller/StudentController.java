package com.oneclick.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.oneclick.model.Student;

@RestController
public class StudentController {

	private List<Student> students=new ArrayList<>();
	
	public StudentController() {
		// TODO Auto-generated constructor stub
		
		students.add(new Student(10,"Ram",800));
		students.add(new Student(11,"Rahul",400));
		students.add(new Student(12,"Ravi",500));
		students.add(new Student(13,"Ramesh",600));
		students.add(new Student(14,"Rakesh",700));
		
	}
	
	
	@GetMapping("/students")
	public List<Student> getAllStudentsDetaild(){
		
		return students;
	}
	
	
	@GetMapping("/students/{roll}")
	public Student getStudentByRollNo(@PathVariable("roll") int roll) {
		
		List<Student> list= students.stream().filter(s->s.getRoll()==roll).collect(Collectors.toList());
		
		if(list.size()==0)
			throw new IllegalArgumentException("Student does not exist with Roll "+roll);
		
		return list.get(0);
	}
	
	@PostMapping("/students")
	public String addStudentHandler(@RequestBody Student student){
		
		students.add(student);
		
		return "Student Added Sucessfully...";
	}
	
	@PutMapping("/students/{roll}")
	public Student updateStudentHandler1(@RequestBody Student student,@PathVariable("roll") int roll) {
		
		boolean flag=true;
		
		for(Student st: students) {
			
			if(st.getRoll()==roll) {
				st.setMarks(student.getMarks());
				st.setName(student.getName());
				
				flag=false;
				break;
			}
		}
		
		if(flag) {
			throw new IllegalArgumentException("Student does not exist with Roll :" + roll);
		}
		
		return student;
	}
	
	@DeleteMapping("/students/{roll}")
	public String deleteStudentHandler(@PathVariable Integer roll) {
		
		boolean flag=students.removeIf(s->s.getRoll()==roll);
		
		if(flag) {
			return "Student Deleted Sucessfully";
			
		}else {
			throw new IllegalArgumentException("Student not found with roll no: "+roll);
		}
	}
	
	@PutMapping("students/{roll}/{gmarks}")
	public String graceMarksHandler(@PathVariable("roll") Integer roll,@PathVariable("gmarks") Integer gmarks) {
		
		boolean flag=true;
		
		for(Student st:students) {
			if(st.getRoll()==roll) {
				st.setMarks(st.getMarks()+gmarks);
				
				flag=false;
				break;
			}
		}
		if(flag) {
			throw new IllegalArgumentException("Student with roll no.:"+roll+"Not found");
		}
		
		return "Student marks is Graced sucessfully......";
	}
}
