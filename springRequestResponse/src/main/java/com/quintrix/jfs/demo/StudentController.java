package com.quintrix.jfs.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping
	public List<Student> getStudents() {
		return Arrays.asList(new Student(1,"John", "Doey", "Biology"));
	}
	
	@ResponseBody @PostMapping("/request")
	public String greet(@RequestBody Student sinput) {
//		Student s = new Student();
//		s.setFirstName("John");
//		s.setLastName("Doe");
//		s.setMajor("Biology");
		String student = sinput.getFirstName() + " " + sinput.getLastName() + " (id: " + sinput.getId() + ") is a " + sinput.getMajor() + " major";
	
		return student;
	}
}

