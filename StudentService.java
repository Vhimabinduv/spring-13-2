package com.vp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.vp.dao.Studentdao;
import com.vp.model.Student;



@Service
public class StudentService {
	@Autowired
	Studentdao studentdao;

	public List<Student> getAllUsers(){
	return studentdao.getStudent();
	}

	public ResponseEntity<Student> insertUser(Student student) {
		// TODO Auto-generated method stub
		return studentdao.insertUser(student);
	}

	public ResponseEntity<Student> getStudent(int id) {
		// TODO Auto-generated method stub
		return studentdao.getStudent( id);
	}

	 public int deleteStudent1(int id) {
		return studentdao.deleteStudent(id);
		 
	 }

	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	public Student putStudent(Student student) {
		// TODO Auto-generated method stub
		return studentdao.putStudent(student);
	}
	 
	}
