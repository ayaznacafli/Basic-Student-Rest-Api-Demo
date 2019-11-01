package com.ayaz.service;

import com.ayaz.dto.StudentDTO;
import com.ayaz.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(StudentDTO studentDTO);
    void updateStudent(int id,StudentDTO studentDTO);
    void deleteStudent(int id);
    Student getStudentById(int id);
    List<Student> getStudents();
}
