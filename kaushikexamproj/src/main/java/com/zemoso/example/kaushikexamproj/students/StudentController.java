package com.zemoso.example.kaushikexamproj.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {
    @Autowired
    private  StudentService studentService;
    @RequestMapping("/Students")
    public List<Student> details(){
        return studentService.getStudents();}
    @RequestMapping("/Students/{rollno}")
    public Student get(@PathVariable int rollno)
    {
        return studentService.getStudentByRollno(rollno);
    }

}
