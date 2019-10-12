package com.sda.mapper;

import com.sda.dto.TeacherDTO;
import com.sda.entities.Teacher;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapper {

    public TeacherDTO convertTeacherToTeacherDTO(Teacher teacher){
        System.out.println("Am ajuns in clasa TeacherMapper");
        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setFirstName(teacher.getFirstName());
        teacherDTO.setLastName(teacher.getLastName());
        teacherDTO.setDiscipline(teacher.getDiscipline());

        return teacherDTO;
    }
    public Teacher convertTeacherDTOToTeacher(TeacherDTO teacherDTO){
        System.out.println("Am ajuns in clasa TeacherMapper");
        Teacher teacher = new Teacher();
        teacher.setFirstName(teacherDTO.getFirstName());
        teacher.setLastName(teacherDTO.getLastName());
        teacher.setDiscipline(teacherDTO.getDiscipline());

        return teacher;
    }

}
