package com.sda.service;

import com.sda.dto.TeacherDTO;
import com.sda.entities.Teacher;
import com.sda.mapper.TeacherMapper;
import com.sda.repository.TeacherRepo;
import com.sda.validator.TeacherValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private TeacherRepo teacherRepo;
    TeacherMapper teacherMapper = new TeacherMapper();

    @Autowired
    private TeacherValidator teacherValidator;

    public TeacherRepo getTeacherRepo() {
        return teacherRepo;
    }

    @Autowired
    public void setTeacherRepo(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    public void addTeacher(TeacherDTO teacherDTO) {
        System.out.println("Am ajuns in clasa TeacherService");
        if (teacherValidator.isDTOValid(teacherDTO)) {
            Teacher teacher = teacherMapper.convertTeacherDTOToTeacher(teacherDTO);
            getTeacherRepo().createTeacher(teacher);
        } else {
            System.out.println("Datele nu sunt valide");
        }
    }

    public void displayTeacher(Integer id) {
        System.out.println("Am ajuns in clasa TeacherService");
        Teacher teacher = getTeacherRepo().readTeacher(id);
        System.out.println(teacher);
    }

    public void updateTeacher(Integer id, String discipline) {
        System.out.println("Am ajuns in clasa TeacherService");
        Teacher teacher = getTeacherRepo().modifyTeacher(id, discipline);
        System.out.println(teacher);
    }

    public void deleteTeacher(Integer id) {
        System.out.println("Am ajuns in clasa TeacherService");
        getTeacherRepo().takeoutTeacher(id);
    }
}
