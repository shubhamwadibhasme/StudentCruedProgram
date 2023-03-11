package com.student.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.api.dao.StudentsDao;
import com.student.api.enitity.Students;

@Service
public class StudentsService {
	
	@Autowired
	StudentsDao sd;
	
	public List<Students> getAllStudent() {
		
		List<Students> student = sd.getAllStudent();
		return student;
		
	}

	public boolean insertStudent(Students student) {
		return sd.insertStudent(student);
		
	}

	public boolean deleteStudentbyrollno(int rollno) {
		return sd.deleteStudentbyrollno(rollno);
		
	}

	public boolean updateStudentbyrollno(int rollno) {
		return sd.updateStudentbyrollno(rollno);
		
	}

}
