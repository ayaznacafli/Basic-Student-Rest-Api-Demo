package com.ayaz;

import com.ayaz.dto.StudentDTO;
import com.ayaz.model.Student;
import com.ayaz.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class EvamTaskApplication {

    public static void main(String[] args) {
      ConfigurableApplicationContext contex = SpringApplication.run(EvamTaskApplication.class, args);
        StudentService studentService = contex.getBean(StudentService.class);



    }

}
