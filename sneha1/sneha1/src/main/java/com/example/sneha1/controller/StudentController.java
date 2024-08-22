package com.example.sneha1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.sneha1.model.Student;
import com.example.sneha1.service.StudentService;


@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping("/student")
    public List<Student>getStudent() { 
        return studentService.getStudent();
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student stud) { 
        return studentService.addStudent(stud); 
    }
    @GetMapping("/student/{id}")
    public Student addStudent(@PathVariable int id)
    {
        return studentService.addStudent(id);}
    

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }
}