package com.example.StudentCRUD2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int rno;
    private String name;
    private String dept;
}
