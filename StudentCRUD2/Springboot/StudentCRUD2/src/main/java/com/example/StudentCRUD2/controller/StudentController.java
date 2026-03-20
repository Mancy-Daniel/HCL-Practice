package com.example.StudentCRUD2.controller;

import com.example.StudentCRUD2.model.Student;
import com.example.StudentCRUD2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudent(){
        return studentService.getstdnt();
    }
    @GetMapping("/students/{rno}")
    public Student getStudentByID(@PathVariable("rno") int rollno){
        return studentService.getstdntbyid(rollno);
    }

}
