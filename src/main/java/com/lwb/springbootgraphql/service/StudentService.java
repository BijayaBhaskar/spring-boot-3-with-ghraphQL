package com.lwb.springbootgraphql.service;

import com.lwb.springbootgraphql.entity.Student;

import java.util.List;

public interface StudentService {

    //Create
    Student create(Student student);

    //Get All Student

    List<Student> getAll();

    //GetById
    Student getById(long id);
}
