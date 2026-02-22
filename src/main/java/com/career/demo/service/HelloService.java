package com.career.demo.service;


import com.career.demo.model.Student;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public Student getStudent(){
        return new Student(1,"Raj");
    }


}
