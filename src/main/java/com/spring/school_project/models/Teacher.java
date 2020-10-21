package com.spring.school_project.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Teacher extends Person{

	@Column
	private String specialty;
	
	@ManyToMany(mappedBy = "teachers")
	private List<Student> students = new ArrayList<>();
	
	@OneToMany(mappedBy = "teacher")
	private List<Subject> subjects;
	
	  
	public Teacher() {
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return getSurname();
	}
}