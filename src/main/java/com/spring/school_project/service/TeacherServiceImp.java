package com.spring.school_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.school_project.models.Teacher;
import com.spring.school_project.repository.ITeacherRepository;

@Service
public class TeacherServiceImp implements ITeacherService{
	
	@Autowired
	private ITeacherRepository teacherRepo;

	@Override
	public Teacher save(Teacher t) {
		return teacherRepo.save(t);
	}

	@Override
	public List<Teacher> read() {
		return teacherRepo.findAll();
	}

	@Override
	public void update() {	
		Teacher t=new Teacher();
		teacherRepo.save(t);
	}

	@Override
	public void delete() {	
		teacherRepo.deleteById(1L);
	}
}