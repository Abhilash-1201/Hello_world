package org.jsp.serviceImpl;

import java.util.List;

import org.jsp.dao.Studentdao;
import org.jsp.model.Student;
import org.jsp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private Studentdao studentdao;
	@Transactional
	public void add(Student student) {
		
		studentdao.add(student);
		
	}

	@Transactional
	public void edit(Student student) {
		studentdao.edit(student);
		
	}

	@Transactional
	public void delete(int studentId) {
		studentdao.delete(studentId);
		
	}

	@Transactional
	public Student getStudentById(int studentId) {
		
		return studentdao.getStudentById(studentId);
	}

	@Transactional
	public List getAllStudents() {
		
		return studentdao.getAllStudents();
	}

}
