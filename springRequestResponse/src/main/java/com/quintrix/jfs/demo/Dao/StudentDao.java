package com.quintrix.jfs.demo.Dao;

import java.util.List;
import com.quintrix.jfs.demo.Model.Student;

public interface StudentDao {
	public List<Student> getStudents();
	public Student postStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
}
