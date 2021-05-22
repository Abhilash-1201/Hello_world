package org.jsp.SpringHibernateCURD.Dao;

import java.util.List;

import org.jsp.SpringHibernateCURD.model.Student;

public interface Studentdao 
{
	public void add(Student student);
	public void edit(Student student);
	public void delete(int studentId);
	public Student getStudentById(int studentId);
	public List getAllStudents();
}
