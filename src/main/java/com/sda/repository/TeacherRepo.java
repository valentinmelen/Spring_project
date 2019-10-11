package com.sda.repository;

import com.sda.dao.implementation.TeacherDaoImp;
import com.sda.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepo {

    private TeacherDaoImp teacherDaoImp;

    public TeacherDaoImp getTeacherDaoImp() {
        return teacherDaoImp;
    }
    @Autowired
    public void setTeacherDaoImp(TeacherDaoImp teacherDaoImp) {
        this.teacherDaoImp = teacherDaoImp;
    }

    public void createTeacher(Teacher teacher){
        getTeacherDaoImp().addTeacher(teacher);
    }

    public Teacher readTeacher(Integer id) {
        Teacher teacher = getTeacherDaoImp().displayTeacherById(id);
        return teacher;
    }

    public Teacher modifyTeacher(Integer id, String discipline) {
        Teacher teacher = getTeacherDaoImp().updateTeacherById(id, discipline);
        return teacher;
    }

    public void takeoutTeacher(Integer id) {
        getTeacherDaoImp().deleteTeacherById(id);
    }
}
