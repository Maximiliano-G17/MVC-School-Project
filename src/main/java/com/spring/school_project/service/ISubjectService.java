package com.spring.school_project.service;

import java.util.List;

import com.spring.school_project.models.Subject;


public interface ISubjectService {
	
	public Subject save(Subject subject);
	public List<Subject> read();
	public void delete();

}