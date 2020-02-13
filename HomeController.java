package com.vp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vp.dao.Studentdao;
import com.vp.model.Student;
import com.vp.service.StudentService;

@RestController
public class HomeController {
/*@Autowired
Studentdao dao;*/
	@Autowired
	StudentService studentService;
@RequestMapping("/homedata")
public ResponseEntity<Student> getHomeData() {

return new ResponseEntity<Student>(new Student(11,"Giri", "Add1111"), HttpStatus.OK);

}
@GetMapping("/getAllStudent")
public List<Student> getStudent(){

return studentService.getStudent();
}
@GetMapping("/student/{id}")
public ResponseEntity<Student> getStudent(@PathVariable("id") int id) {
return studentService.getStudent(id);
}

@PostMapping("/student")
public ResponseEntity<Student> saveUser(@RequestBody Student student) {
return studentService.insertUser(student);
}

@DeleteMapping("student/{id}")
public int deleteStudent(@PathVariable("id") int id) {
return studentService.deleteStudent1(id);
}

@RequestMapping("/listStudent")
List<Student> getStudent(Model model) {
List<Student> list = studentService.getAllUsers();
model.addAttribute("list", list);

return list;
}
@PutMapping("/student")
public Student updateStudent(@RequestBody Student student)
{
	return studentService.putStudent(student);
			}

}