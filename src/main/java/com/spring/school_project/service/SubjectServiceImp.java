package com.spring.school_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.school_project.models.Subject;
import com.spring.school_project.repository.ISubjectRepository;

@Service
public class SubjectServiceImp implements ISubjectService{
	
	@Autowired
	private ISubjectRepository subjectRepo;

	@Override
	public Subject save(Subject subject) {
		return subjectRepo.save(subject);
	}

	@Override
	public List<Subject> read() {
		return subjectRepo.findAll();
	}

	@Override
	public void delete() {
		subjectRepo.deleteById(1L);
	}
}