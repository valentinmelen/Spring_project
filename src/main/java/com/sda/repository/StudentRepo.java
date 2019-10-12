package com.sda.repository;

import com.sda.dao.implementation.StudentDaoImp;
import com.sda.dto.StudentDTO;
import com.sda.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepo {
    private StudentDaoImp studentDaoImp;

    public StudentDaoImp getStudentDaoImp() {
        return studentDaoImp;
    }
    @Autowired
    public void setStudentDaoImp(StudentDaoImp studentDaoImp) {
        this.studentDaoImp = studentDaoImp;
    }


    public void createStudent(Student student) {
        System.out.println("Am ajuns in clasa StudentRepo");
        getStudentDaoImp().addStudent(student);
    }
    public Student readStudent(Integer id){
        System.out.println("Am ajuns in clasa StudentRepo");
        Student student = getStudentDaoImp().displayStudentById(id);
        return student;
    }
    public List<Student> readAllStudent(){
        List<Student> studentList = getStudentDaoImp().displayAllStudent();
        return studentList;
    }
    public Student modifyStudent(Integer id, Double averageGrade) {
        System.out.println("Am ajuns in clasa StudentRepo");
        Student student = getStudentDaoImp().updateStudentById(id,averageGrade);
        return student;
    }

    public void takeoutStudent(Integer id) {
        getStudentDaoImp().deleteStudentById(id);
    }
}
