package com.sda.entyPoints;

import com.sda.dto.StudentDTO;
import com.sda.dto.TeacherDTO;
import com.sda.entities.Student;
import com.sda.entities.Teacher;
import com.sda.mapper.StudentMapper;
import com.sda.service.StudentService;
import com.sda.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EntryPoint {
    private StudentService studentService;
    private TeacherService teacherService;

    public TeacherService getTeacherService() {
        return teacherService;
    }

    @Autowired
    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }


    //----------STUDENT-----------
    public void executeStudent(StudentDTO studentDTO) {
        System.out.println("Am ajuns in clasa EntryPoint");
        getStudentService().addStudent(studentDTO);
    }
    public void showAllStudent(){
        System.out.println("Am ajuns in clasa EntryPoint");
        List<StudentDTO> studentDTOList = getStudentService().displayAllStudent();
        for(StudentDTO studentDTO: studentDTOList){
            System.out.println(studentDTO);
        }
    }
    public void showStudent(Integer id) {
        System.out.println("Am ajuns in clasa EntryPoint");
        getStudentService().displayStudent(id);
    }

    public void changeStudent(Integer id, Double averageGrade) {
        System.out.println("Am ajuns in clasa EntryPoint");
        getStudentService().updateStudent(id, averageGrade);
    }

    public void removeStudent(Integer id) {
        System.out.println("Am ajuns in clasa EntryPoint");
        getStudentService().deleteStudent(id);
    }


    //----------TEACHER-----------
    public void executeTeacher(TeacherDTO teacherDTO) {
        System.out.println("Am ajuns in clasa EntryPoint");
        getTeacherService().addTeacher(teacherDTO);
    }

    public void showTeacher(Integer id) {
        System.out.println("Am ajuns in clasa EntryPoint");
        getTeacherService().displayTeacher(id);
    }

    public void changeTeacher(Integer id, String discipline) {
        System.out.println("Am ajuns in clasa EntryPoint");
        getTeacherService().updateTeacher(id, discipline);
    }

    public void removeTeacher(Integer id) {
        System.out.println("Am ajuns in clasa EntryPoint");
        getTeacherService().deleteTeacher(id);
    }

}
