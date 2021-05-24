package org.jsp.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.jsp.dao.Studentdao;
import org.jsp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoimpl implements Studentdao
{
	@Autowired
	private SessionFactory session;
	@Override
	public void add(Student student) 
	{
		session.getCurrentSession().save(student);
		
	}

	@Override
	public void edit(Student student) {
		session.getCurrentSession().update(student);
		
	}

	@Override
	public void delete(int studentId) {
		session.getCurrentSession().delete(getStudentById(studentId));
		
	}

	@Override
	public Student getStudentById(int studentId) {
		
		return (Student) session.getCurrentSession().get(Student.class, studentId);
	}

	@Override
	public List getAllStudents() {
		
		return session.getCurrentSession().createQuery("from Student").list();
	}

}
