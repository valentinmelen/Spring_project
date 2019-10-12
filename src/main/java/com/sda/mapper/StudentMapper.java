package com.sda.mapper;

import com.sda.dto.StudentDTO;
import com.sda.entities.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public StudentDTO convertStudentToStudentDTO(Student student) {//paramrtru de la care se iau date

        System.out.println("Am ajuns in clasa StudentMapper");
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setLastName(student.getLastName());
        studentDTO.setAverageGrade(student.getAverageGrade());

        return studentDTO;
    }

    public Student convertStudentDTOToStudent(StudentDTO studentDTO) {
        System.out.println("Am ajuns in clasa StudentMapper");
        Student student = new Student();
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setAverageGrade(studentDTO.getAverageGrade());

        return student;
    }
}
