package com.vp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.vp.model.Student;

@Component
public class Studentdao {

static List<Student> list =null;
static {
list = new ArrayList<Student>();
list.add(new Student(1, "Anil", "english"));
list.add(new Student(2, "Aji", "telugu"));
list.add(new Student(3, "Sanal", "hindi"));
list.add(new Student(4, "Nibin", "socaial"));
}

public List<Student> getStudent(){

return Studentdao.list;
}
public ResponseEntity<Student> insertUser(Student student){
list.add(student);
return new ResponseEntity<Student>(student, HttpStatus.OK);
}
public ResponseEntity<Student> getStudent(int id){
for (Student student: list) {
if(student.getUid() == id) {
return new ResponseEntity<Student>(student, HttpStatus.OK);
}
}
return null;
}
public int deleteStudent(int id){
for (Student student : list) {
if(student.getUid() == id) {
list.remove(student);
return id;
}
}
return 0;
}
public Student putStudent(Student student) {
	for (Student student1 : list) {
		if(student1.getUid() == student.getUid() ){
		list.remove(student1);
		list.add(student);
		return student;
}
}

	return null;
}
}