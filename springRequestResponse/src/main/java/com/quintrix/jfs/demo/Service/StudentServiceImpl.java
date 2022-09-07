package com.quintrix.jfs.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quintrix.jfs.demo.Dao.StudentDao;
import com.quintrix.jfs.demo.Model.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentDao studentDao;
	
	@Override
	public List<Student> getAllStudents() {	
		return studentDao.getStudents();
	}

	@Override
	public Student postStudent(Student student) {
		return studentDao.postStudent(student);
	}

	@Override
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}

	@Override
	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);
	}
}
