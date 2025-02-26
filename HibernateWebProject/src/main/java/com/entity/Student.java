package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StdCourse")
public class Student {
	@Id
	private String StudentID;
	private String name;
	private String course;
	
	
	public Student() {
		
	}
	
	public Student(String studentID, String name, String course) {
		super();
		StudentID = studentID;
		this.name = name;
		this.course = course;
	}
	
	
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	
	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", name=" + name + ", course=" + course + "]";
	}
	
	
	
}
