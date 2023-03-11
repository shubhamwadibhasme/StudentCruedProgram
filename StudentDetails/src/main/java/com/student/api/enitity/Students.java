package com.student.api.enitity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Students {
	
	private int rollno;
	private String name;
	private int marks;
	
	@Id
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	

}
