package com.spring.school_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.school_project.models.Student;
import com.spring.school_project.repository.IStudentRepository;

@Service
public class StudentServiceImp implements IStudentService{
	
	@Autowired
	private IStudentRepository studentRepo;

	@Override
	public Student save(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public List<Student> read() {
		return studentRepo.findAll();
	}

	@Override
	public Student findById(Long id) {
		return studentRepo.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		studentRepo.deleteById(id);
	}
}