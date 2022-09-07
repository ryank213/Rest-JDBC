package com.quintrix.jfs.demo.Service;

import java.util.List;

import com.quintrix.jfs.demo.Model.Student;

public interface StudentService {
	public List<Student> getAllStudents();
	public Student postStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
}
