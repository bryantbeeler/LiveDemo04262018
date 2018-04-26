package com.example.livedemo.Controller;


import com.example.livedemo.Model.Student;
import com.example.livedemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudentList();
    }
}
