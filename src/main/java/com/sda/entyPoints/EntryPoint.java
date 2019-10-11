package com.sda.entyPoints;

import com.sda.entities.Student;
import com.sda.entities.Teacher;
import com.sda.service.StudentService;
import com.sda.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    public void executeStudent(){
        Student student = new Student();
        student.setFirstName("Andrei");
        student.setLastName("Melen");
        student.setAge(25);
        student.setAverageGrade(4.99);

        getStudentService().addStudent(student);
    }
    public void showStudent(Integer id){
        getStudentService().displayStudent(id);
    }
    public void changeStudent(Integer id, Double averageGrade){
        getStudentService().updateStudent(id, averageGrade);
    }
    public void removeStudent(Integer id){
        getStudentService().deleteStudent(id);
    }


    //----------TEACHER-----------
    public void executeTeacher(){
        Teacher teacher = new Teacher();
        teacher.setFirstName("Constantin");
        teacher.setLastName("Aflori");
        teacher.setAge(48);
        teacher.setDiscipline("Prelucrarea imaginii");

        getTeacherService().addTeacher(teacher);
    }
    public void showTeacher(Integer id){
        getTeacherService().displayTeacher(id);
    }

    public void changeTeacher(Integer id, String discipline) {
        getTeacherService().updateTeacher(id,discipline);
    }
    public void removeTeacher(Integer id){
        getTeacherService().deleteTeacher(id);
    }

}
