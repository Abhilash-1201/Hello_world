package org.jsp.service;

import java.util.List;

import org.jsp.model.Student;

public interface StudentService
{

	public void add(Student student);
	public void edit(Student student);
	public void delete(int studentId);
	public Student getStudentById(int studentId);
	public List getAllStudents();
}
