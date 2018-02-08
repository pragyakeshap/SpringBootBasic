package com.pragya.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pragya.Entity.Student;
import com.pragya.Service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents() {
		return service.getAllStudents();
	}

}
