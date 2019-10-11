package com.sda.repository;

import com.sda.dao.implementation.StudentDaoImp;
import com.sda.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
        getStudentDaoImp().addStudent(student);
    }
    public Student readStudent(Integer id){
        Student student = getStudentDaoImp().displayStudentById(id);
        return student;
    }
    public Student modifyStudent(Integer id, Double averageGrade) {
        Student student = getStudentDaoImp().updateStudentById(id,averageGrade);
        return student;
    }

    public void takeoutStudent(Integer id) {
        getStudentDaoImp().deleteStudentById(id);
    }
}
