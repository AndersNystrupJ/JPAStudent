package com.example.jpastudent.studentRepository;

import com.example.jpastudent.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
