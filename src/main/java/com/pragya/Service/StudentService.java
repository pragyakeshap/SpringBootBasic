package com.pragya.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragya.DAO.StudentDAO;
import com.pragya.Entity.Student;

@Service
public class StudentService {
	
@Autowired	
private StudentDAO dao;
	
	public Collection<Student> getAllStudents() {
		return dao.getAllStudents();
	}

}
