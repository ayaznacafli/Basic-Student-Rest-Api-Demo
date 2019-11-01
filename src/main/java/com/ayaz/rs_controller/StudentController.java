package com.ayaz.rs_controller;

import com.ayaz.dto.StudentDTO;
import com.ayaz.model.Student;
import com.ayaz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/evam")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/students",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @PostMapping(value = "/students/",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> saveStudent(@RequestBody @Valid StudentDTO studentDTO){
        Student student = studentService.saveStudent(studentDTO);
        return new ResponseEntity<Student>(student, HttpStatus.CREATED);
    }
    @PutMapping(value = "/students/{id}",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> updateStudent(@PathVariable(name = "id") int id,@RequestBody @Valid StudentDTO studentDTO){
        studentService.updateStudent(id,studentDTO);
        return new ResponseEntity<>("Student is updated successsfully", HttpStatus.OK);
    }
    @DeleteMapping(value = "/students/{id}")
    public ResponseEntity<Object> deleteStudent(@PathVariable(name = "id") int id){
        studentService.deleteStudent(id);
        return new ResponseEntity<Object>("Student is deleted successsfully", HttpStatus.OK);
    }
    @GetMapping(value = "/students/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Student getStudentById(@PathVariable(name = "id") int id){
         return studentService.getStudentById(id);
    }
}
