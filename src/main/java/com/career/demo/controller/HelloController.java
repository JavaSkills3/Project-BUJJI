package com.career.demo.controller;

import com.career.demo.model.Student;
import com.career.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService){
        this.helloService=helloService;
    }

    @GetMapping("/hello")
    public Student sayHello(){
        return helloService.getStudent();
    }
}
