package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.binding.Student;
import com.example.entity.StudentEnquiry;
import com.example.repository.StudentRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	public void SaveData(Student student) {
		System.out.println(student);
		StudentEnquiry target=new StudentEnquiry();
		BeanUtils.copyProperties(student, target);
		target.setTimings(Arrays.toString(student.getTimings()));
		System.out.println(target);
		repo.save(target);
		
	}
	
	public List<String> getCourses(){
		return Arrays.asList("Java","Python","Aws","ReactJs");
	}
	
	public List<String> getTimings(){
		return Arrays.asList("Mrng","Noon","Evng");
	}
}
