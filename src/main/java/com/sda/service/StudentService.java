package com.sda.service;

import com.sda.dto.StudentDTO;
import com.sda.entities.Student;
import com.sda.mapper.StudentMapper;
import com.sda.repository.StudentRepo;
import com.sda.validator.StudentValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private StudentRepo studentRepo;
    StudentMapper studentMapper = new StudentMapper();
    @Autowired
    private StudentValidator studentValidator;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(StudentDTO studentDTO) {
        System.out.println("Am ajuns in clasa StudentService");
        if (studentValidator.isDTOValid(studentDTO)) {
            Student student = studentMapper.convertStudentDTOToStudent(studentDTO);
            getStudentRepo().createStudent(student);
        } else {
            System.out.println("Datele nu sunt valide");
        }
    }

    public List<StudentDTO> displayAllStudent() {
        List<Student> studentList = getStudentRepo().readAllStudent();
        List<StudentDTO> studentDTOList = new ArrayList<>();
        for (Student student: studentList) {
            studentDTOList.add(studentMapper.convertStudentToStudentDTO(student));
        }

        return studentDTOList;
    }

    public void displayStudent(Integer id) {
        System.out.println("Am ajuns in clasa StudentService");
        Student student = getStudentRepo().readStudent(id);
        System.out.println(student);
    }

    public void updateStudent(Integer id, Double averageGrade) {
        System.out.println("Am ajuns in clasa StudentService");
        Student student = getStudentRepo().modifyStudent(id, averageGrade);
        System.out.println(student);
    }

    public void deleteStudent(Integer id) {
        System.out.println("Am ajuns in clasa StudentService");
        getStudentRepo().takeoutStudent(id);
    }
}
