package com.student.api.dao;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.api.enitity.Students;

@Repository
public class StudentsDao {
	
	@Autowired
	SessionFactory sf;

	public List<Students> getAllStudent() {
	Session session = sf.openSession();
	Criteria criteria = session.createCriteria(Students.class);
	List<Students> student = criteria.list();
	session.close();
	return student;
		
	}

	public boolean insertStudent(Students student) {
	Session session = sf.openSession();	
	Transaction tr = session.beginTransaction();
	session.save(student);
	tr.commit();
	session.close();
	return true;
	}

	public boolean deleteStudentbyrollno(int rollno) {
	Session session = sf.openSession();		
	Transaction tr = session.beginTransaction();
	Students student = session.get(Students.class, rollno);
    session.delete(student);
    tr.commit();
    session.close();
    return true;
	}

	public boolean updateStudentbyrollno(int rollno) {
	Session session = sf.openSession();		
	Transaction tr = session.beginTransaction();
	Students student = session.get(Students.class, rollno);
    session.update(student);
    tr.commit();
    session.close();
    return true;	
	
	}

}
