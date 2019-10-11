package com.sda.service;

import com.sda.entities.Teacher;
import com.sda.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private TeacherRepo teacherRepo;

    public TeacherRepo getTeacherRepo() {
        return teacherRepo;
    }

    @Autowired
    public void setTeacherRepo(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    public void addTeacher(Teacher teacher) {
        getTeacherRepo().createTeacher(teacher);
    }

    public void displayTeacher(Integer id) {
        Teacher teacher = getTeacherRepo().readTeacher(id);
        System.out.println(teacher);
    }
    public void updateTeacher(Integer id, String discipline){
        Teacher teacher = getTeacherRepo().modifyTeacher(id, discipline);
        System.out.println(teacher);
    }
    public void deleteTeacher(Integer id){
        getTeacherRepo().takeoutTeacher(id);
    }
}
