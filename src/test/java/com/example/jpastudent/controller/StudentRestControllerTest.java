package com.example.jpastudent.controller;

import com.example.jpastudent.model.Student;
import com.example.jpastudent.studentRepository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRestControllerTest {
    @Autowired
    StudentRepository studentRepository;

    @Test
    void testStud() {
        Student s1 = new Student();
        s1.setName("test");
        studentRepository.save(s1);
        s1.setId(0);
        studentRepository.save(s1);
        assertEquals(2,studentRepository.findAll().size());
    }

}