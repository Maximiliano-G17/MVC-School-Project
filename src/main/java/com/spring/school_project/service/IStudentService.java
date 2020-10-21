package com.spring.school_project.service;

import java.util.List;

import com.spring.school_project.models.Student;


public interface IStudentService{
	
	public Student findById(Long id);
	public Student save(Student student);
	public List<Student> read();
	public void delete(Long id);

}
