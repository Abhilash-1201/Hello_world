package org.jsp.controller;

import java.util.Map;


import org.jsp.model.Student;
import org.jsp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController 
{
	private static final String STUDENT = "student"; 
	
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/index")
	public String setupform(Map<String,Object> map)
	{
		Student student = new Student();
		map.put(STUDENT, student);
		map.put("studentList",studentservice.getAllStudents());
		
		return STUDENT;
		
	}
	@RequestMapping(value="/student.do" , method=RequestMethod.POST)
	public String doActions(@ModelAttribute Student student,BindingResult result,@RequestParam String action,Map<String,Object> map)
	{
		Student studentResult = new Student();
		
		switch(action.toLowerCase())
		{
		case "add":
			studentservice.add(student);
			studentResult = student;
			break;
		case "edit":
			studentservice.edit(student);
			studentResult = student;
			break;
		case "delete":
			studentservice.delete(student.getStudentId());
			studentResult = new Student();
			break;
		case "search":
			Student searchStudent = studentservice.getStudentById(student.getStudentId());
			studentResult = searchStudent!= null ? searchStudent : new Student();
			break;
			
		
		}
		map.put(STUDENT, studentResult);
		map.put("studentList", studentservice.getAllStudents());
		return STUDENT;
		
	}
}
