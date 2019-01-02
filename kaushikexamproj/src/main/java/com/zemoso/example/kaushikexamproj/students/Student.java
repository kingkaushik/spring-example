package com.zemoso.example.kaushikexamproj.students;

public class Student {
    public int rollno;
    public String name;
    public int marks;
    public int rank;




    public Student(int rollno, String name, int marks, int rank) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.rank = rank;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
