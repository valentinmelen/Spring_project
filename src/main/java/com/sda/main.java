package com.sda;

import com.sda.dto.StudentDTO;
import com.sda.dto.TeacherDTO;
import com.sda.entyPoints.EntryPoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DependencyConfig.class);
        EntryPoint entryPoint = applicationContext.getBean(EntryPoint.class);


        entryPoint.showAllStudent();


        //--------STUDENT-----------

        /*System.out.println("STUDENT:");
        System.out.println("Introduceti un prenume:");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();

        System.out.println("Introduceti numele de familie:");
        String lastName = scanner.nextLine();

        System.out.println("Introduceti o medie anuala:");
        Double averageGrade = scanner.nextDouble();

        System.out.println("Ati introdus datele: ");
        System.out.println(firstName+" "+lastName+" cu media "+averageGrade);

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setFirstName(firstName);
        studentDTO.setLastName(lastName);
        studentDTO.setAverageGrade(averageGrade);

        entryPoint.executeStudent(studentDTO);

        Scanner scannerTeacher = new Scanner(System.in);
        //---------TEACHER------------
        System.out.println("TEACHER:");
        System.out.println("Introduceti un prenume:");
        String firstNameT = scannerTeacher.nextLine();

        System.out.println("Introduceti numele de familie:");
        String lastNameT = scannerTeacher.nextLine();

        System.out.println("Introduceti disciplina: ");
        String discipline = scannerTeacher.nextLine();

        System.out.println("Ati introdus datele: ");
        System.out.println(firstNameT+" "+lastNameT+" cu disciplina "+discipline);

        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setFirstName(firstNameT);
        teacherDTO.setLastName(lastNameT);
        teacherDTO.setDiscipline(discipline);

        entryPoint.executeTeacher(teacherDTO);
*/


        /*//entryPoint.executeStudent();
        entryPoint.showStudent(6);
        entryPoint.changeStudent(6,8.00);
        entryPoint.removeStudent(7);

       // entryPoint.executeTeacher();
        entryPoint.showTeacher(1);
        entryPoint.changeTeacher(2,"Proiectare");
        entryPoint.removeTeacher(4);*/
    }
}
