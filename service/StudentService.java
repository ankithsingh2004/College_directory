package com.kavya.stuDetails.service;



import java.util.List;

import com.kavya.stuDetails.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}