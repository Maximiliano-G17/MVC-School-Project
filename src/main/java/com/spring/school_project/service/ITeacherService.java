package com.spring.school_project.service;

import java.util.List;


import com.spring.school_project.models.Teacher;


public interface ITeacherService {

	public Teacher save(Teacher t);
	public List<Teacher> read();
	public void update();
	public void delete();
}
