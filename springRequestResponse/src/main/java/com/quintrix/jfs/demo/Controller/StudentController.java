package com.quintrix.jfs.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.jfs.demo.Model.Student;
import com.quintrix.jfs.demo.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public Student greet(@RequestBody Student student) {
		return studentService.postStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/students")
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }
}

