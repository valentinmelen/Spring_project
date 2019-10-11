package com.sda.dao;

import com.sda.entities.Teacher;

public interface TeacherDAO {

    void addTeacher(Teacher teacher);
    Teacher displayTeacherById(Integer id);
    Teacher updateTeacherById(Integer id, String discipline);
    void deleteTeacherById(Integer id);
}
