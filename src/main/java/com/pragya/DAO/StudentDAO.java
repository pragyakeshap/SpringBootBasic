package com.pragya.DAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.pragya.Entity.Student;

@Repository
public class StudentDAO {

		static Map<Integer, Student> students;

	static {

		students = new HashMap<Integer, Student>() {
			{
				put(1, new Student(1, "Norah", "Chanda Mama"));
				put(2, new Student(2, "Pragya", "Spring Boot"));
				put(3, new Student(3, "Akhil", "MBA"));
			}
		};

	}

	public Collection<Student> getAllStudents() {
		return students.values();
	}

}
