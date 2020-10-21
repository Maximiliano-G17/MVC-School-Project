package com.spring.school_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.school_project.models.Teacher;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher, Long>{

}
