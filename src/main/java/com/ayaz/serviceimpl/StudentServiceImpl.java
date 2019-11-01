package com.ayaz.serviceimpl;

import com.ayaz.dto.StudentDTO;
import com.ayaz.model.Student;
import com.ayaz.repository.StudentRepository;
import com.ayaz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(StudentDTO studentDTO) {
        return studentRepository.save(this.studentToStudentDTO(studentDTO));
    }

    @Override
    public void updateStudent(int id,StudentDTO studentDTO) {
        Student student = this.studentToStudentDTO(studentDTO);
        student.setId(id);
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.delete(this.getStudentById(id));
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> getStudents() {
        return (List<Student>) studentRepository.findAll();
    }
    private Student studentToStudentDTO(StudentDTO studentDTO){
        Student student = new Student();
        if(studentDTO.getId()!=0)
            student.setId(studentDTO.getId());
        student.setName(studentDTO.getName());
        student.setSurname(studentDTO.getSurname());
        student.setAge(Integer.parseInt(studentDTO.getAge()));
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date brithday = null;
        try {
            brithday=dateFormat.parse(studentDTO.getBrithDate());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        student.setBrithDate(brithday);
        student.setCity(studentDTO.getCity());
        return student;
    }
}
