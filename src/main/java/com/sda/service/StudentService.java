package com.sda.service;

import com.sda.entities.Student;
import com.sda.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepo studentRepo;


    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student student){
        getStudentRepo().createStudent(student);
    }
    public void displayStudent(Integer id){
        Student student = getStudentRepo().readStudent(id);
        System.out.println(student);
    }
    public void updateStudent(Integer id, Double averageGrade){
        Student student = getStudentRepo().modifyStudent(id, averageGrade);
        System.out.println(student);
    }
    public void deleteStudent(Integer id){
        getStudentRepo().takeoutStudent(id);
    }
}
