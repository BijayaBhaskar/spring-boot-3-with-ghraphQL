package com.lwb.springbootgraphql.service.impl;

import com.lwb.springbootgraphql.entity.Student;
import com.lwb.springbootgraphql.repository.StudentRepository;
import com.lwb.springbootgraphql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;
    @Override
    public Student create(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }

    @Override
    public Student getById(long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Students Not Found"));
    }
}
