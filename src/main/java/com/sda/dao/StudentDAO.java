package com.sda.dao;

import com.sda.entities.Student;

public interface StudentDAO {
    void addStudent(Student student);
    Student displayStudentById(Integer id);
    Student updateStudentById(Integer id, Double averageGrade);
    void deleteStudentById(Integer id);
}
