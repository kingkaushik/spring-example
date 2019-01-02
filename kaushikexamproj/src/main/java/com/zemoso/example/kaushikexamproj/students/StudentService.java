package com.zemoso.example.kaushikexamproj.students;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    private List<Student> details= Arrays.asList(
            new Student(101,"John",75,3),
            new Student(102,"Henry",99,1),
            new Student(103,"Charles",93,1));
    public List<Student> getStudents() {
        return details;
    }

    public Student getStudentByRollno(int rollno) {
        return details.stream().filter(i->i.getRollno()==rollno).findFirst().get();
    }
}
