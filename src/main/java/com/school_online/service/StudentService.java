package com.school_online.service;

import com.school_online.entity.Student;
import com.school_online.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    public void save(Student student) {
        studentRepo.save(student);
    }

    public List<Student> findAll() {
        return studentRepo.findAll();
    }
}