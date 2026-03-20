package com.example.StudentCRUD2.service;

import com.example.StudentCRUD2.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Mancy", "CSE"),
                    new Student(2,"Darwin","ECE"),
                    new Student(3, "AT", "CSE")
            )
    );

    public List<Student> getstdnt() {
        return students;
    }

    public Student getstdntbyid(int rollno) {
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getRno() == rollno){
                index = i;
            }
        }
        return students.get(index);

    }
}
