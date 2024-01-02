package com.lwb.springbootgraphql.controller;

import com.lwb.springbootgraphql.entity.Student;
import com.lwb.springbootgraphql.entity.StudentInput;
import com.lwb.springbootgraphql.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService service;

    @QueryMapping("getStudentById")
    public Student getById(@Argument long studentId){

        return service.getById(studentId);
    }

    @QueryMapping("getAll")
    public List<Student> getAll(){
        return service.getAll();
    }

    @MutationMapping("createStudent")
    public Student create(@Argument StudentInput student){
        Student s = new Student();
        s.setName(student.getName());
        s.setcTName(student.getcTName());
        s.setClassName(student.getClassName());
        s.setSection(student.getSection());
        return service.create(s);
    }
}
