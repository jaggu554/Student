package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.binding.Student;
import com.example.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/")
	public String getLoadPage(Model model) {

		init(model);
		return "index";
	}

	public void init(Model model) {
		model.addAttribute("student", new Student());

		model.addAttribute("courses", service.getCourses());

		model.addAttribute("prefTimings", service.getTimings());
	}

	@PostMapping("/save")
	public String saveData(Student s, Model model) {
		// System.out.println(s);
		service.SaveData(s);
		model.addAttribute("msg", "Data Saved...");
		init(model);
		return "index";
	}
}
