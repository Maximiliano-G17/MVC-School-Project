package com.spring.school_project.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "students")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Student extends Person{
	
	@Column
	@Pattern(regexp = "[0-9]{2,20}")
	private String yearStudied;
	
	@ManyToMany
	@JoinTable(name = "students_teachers",joinColumns = @JoinColumn(name="student_person"),
	inverseJoinColumns = @JoinColumn(name="teacher_person"))
	private List<Teacher> teachers = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "students_subject",joinColumns = @JoinColumn(name="id"),
	inverseJoinColumns = @JoinColumn(name="subject_id"))
	private List<Subject> subjects = new ArrayList<>();

	public Student() {
	}

	public String getYearStudied() {
		return yearStudied;
	}

	public void setYearStudied(String yearStudied) {
		this.yearStudied = yearStudied;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
}