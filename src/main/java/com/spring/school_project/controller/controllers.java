package com.spring.school_project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.school_project.models.Student;
import com.spring.school_project.models.Subject;
import com.spring.school_project.service.ISubjectService;
import com.spring.school_project.service.IStudentService;

@Controller
@RequestMapping("views/students")
public class controllers {

	@Autowired
	private IStudentService studentSerivce;

	@Autowired
	private ISubjectService subjectService;

//--------------------------Read user--------------------------	
	@GetMapping("/")
	public String read(Model model) {
		List<Student> students = studentSerivce.read();
		model.addAttribute("students", students);
		return "views/home";
	}

//--------------------------Create user--------------------------	
	@GetMapping("/register")
	public String preRegister(Model model) {
		List<Subject> subjectAll = subjectService.read();
		model.addAttribute("subject", subjectAll);
		model.addAttribute("student", new Student());
		return "/views/students/register";
	}

	@PostMapping("/postRegister")
	public String postRegister(@Valid @ModelAttribute Student student,
			BindingResult result, Model model) {
		List<Subject> subjectAll = subjectService.read();
		if (result.hasErrors()) {
			model.addAttribute("subject", subjectAll);
			model.addAttribute("student", student);
			return "/views/students/register";
		}
		studentSerivce.save(student);
		return "redirect:/views/students/";
	}

//--------------------------Update user--------------------------	
	@GetMapping("/update/{id}")
	public String preUpdate(@PathVariable("id") Long idStudent, Model modelo) {
		Student student = studentSerivce.findById(idStudent);
		List<Subject> subjectAll = subjectService.read();
		if (student == null) {
			return "redirect:/views/";
		}
		modelo.addAttribute("subject", subjectAll);
		modelo.addAttribute("student", student);
		return "views/students/register";
	}

//--------------------------Delete user--------------------------	
	@GetMapping("/delete/{id}")
	public String preDelete(@PathVariable("id") Long idStudent) {
		Student student = studentSerivce.findById(idStudent);
		if (student == null) {
			return "redirect:/views/students/";
		}
		studentSerivce.delete(idStudent);
		return "redirect:/views/students/";
	}
}