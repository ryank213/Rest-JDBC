package com.quintrix.jfs.demo.Dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;
import com.quintrix.jfs.demo.Model.Student;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class StudentDaoImp implements StudentDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Student> getStudents() {
		String sql = "SELECT * FROM students";
		List<Student> students = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
		System.out.println(students);
		return students;
	}

	@Override
	public Student postStudent(Student student) {
		Student s = new Student();
		s.setFirstName(student.getFirstName());
		s.setLastName(student.getLastName());
		s.setId(student.getId());
		s.setMajor(student.getMajor());
		String sql = "INSERT INTO students (firstname, lastname, id, major) VALUE ('" + s.getFirstName() + "', '" + s.getLastName() + "', " + s.getId() + ", '" + s.getMajor() + "');";
		jdbcTemplate.update(sql);
		return s;
	}

	@Override
	public void updateStudent(Student student) {
		String sql = "UPDATE students SET firstname = '" + student.getFirstName() + "' WHERE id = " + student.getId() + ";";
		jdbcTemplate.update(sql);
	}

	@Override
	public void deleteStudent(int id) {
		String sql = "DELETE FROM students WHERE id = " + id + ";";
		jdbcTemplate.update(sql);
	}
}
