package com.example.sneha1.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sneha1.model.Student;
import com.example.sneha1.repository.StudentRepository;
@Service
public class StudentService {
    @Autowired
    StudentRepository repo;
    public List<Student>getStudent(){
        return repo.findAll();
    }
    public Student addStudent(Student stud){
        return repo.save(stud);
    }
    public Student addStudent(int id){
        return repo.findById(id).get();
    } 
    public void deleteStudent(int id ){
        repo.deleteById(id);
    }  
}
