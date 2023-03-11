package com.student.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.api.enitity.Students;
import com.student.api.service.StudentsService;

@RestController
public class StudentsController {
	
	@Autowired
	StudentsService ss ;
	
	@GetMapping("/all")
	public List<Students> getAllStudent() {
		
		List<Students> student =ss.getAllStudent();
		return student;
		
	}
	
	@PostMapping("/add")
	public boolean insertStudent(@RequestBody Students student) {
		boolean inserted = ss.insertStudent(student);
		return inserted;
		
	}
	
	@DeleteMapping("/delete/{rollno}")
	public boolean deleteStudentbyrollno(@PathVariable int rollno) {
		boolean isdelete =	ss.deleteStudentbyrollno(rollno);
		return isdelete; 
	}
	
	@PostMapping("/update/{rollno}")
	boolean updateStudentbyrollno(@PathVariable int rollno) {
		boolean isupdate = ss.updateStudentbyrollno(rollno);
		return isupdate;
	}

}
