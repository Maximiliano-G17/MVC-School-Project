package com.spring.school_project;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.school_project.models.Student;
import com.spring.school_project.models.Subject;
import com.spring.school_project.models.Teacher;
import com.spring.school_project.service.IStudentService;
import com.spring.school_project.service.ISubjectService;
import com.spring.school_project.service.ITeacherService;

@SpringBootTest
class SchoolProjectApplicationTests {
	
	@Autowired
	private ISubjectService subjectSerive;
	
	@Autowired
	private IStudentService studentSerive;
	
	@Autowired
	private ITeacherService teachertSerive;

//	@Test
//	public void createStudent() {
//		Student student=new Student();
//		student.setId(9L);
//		student.setName("Jose Luis");
//		student.setSurname("Messi");
//		student.setDni("22852963");
//		student.setPhone("464246");
//		student.setAdress("Colon 555");	
//		student.setYearStudied("2005");
//		Student studentSaved = studentSerive.save(student);
//		
//		assertTrue(studentSaved.getId().equals(student.getId()));
//	}

//	@Test
//	public void createSubject() {
//		Subject subject=new Subject();
//		subject.setSubject_id(2L);
//		subject.setName("Matematica");
//		subject.setSchedule(null);
//		
//		Subject subjectSaved = subjectSerive.save(subject);
//		assertTrue(subjectSaved.getSubject_id().equals(subject.getSubject_id()));
//	}

	@Test
	public void createTeacher() {
		Teacher teacher=new Teacher();
		teacher.setId(10L);
		teacher.setName("Leonel");
		teacher.setSurname("Andrada");
		teacher.setDni("22963854");
		teacher.setPhone("454145");
		teacher.setAdress("Burgos 555");	
		teacher.setSpecialty("Matematica");
		Teacher teacherSaved = teachertSerive.save(teacher);
		
		assertTrue(teacherSaved.getId().equals(teacher.getId()));	
	}
}