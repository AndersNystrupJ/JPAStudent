package com.example.jpastudent;

import com.example.jpastudent.model.Student;
import com.example.jpastudent.studentRepository.StudentRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class JpaStudentApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        Student std = new Student();
        std.setName("test");
        studentRepository.save(std);
    }

    @Test
    void testOneStudent() {
        List<Student> lst = studentRepository.findAll();
        assertEquals(1,lst.size());
    }

}
