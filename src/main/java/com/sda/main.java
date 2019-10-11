package com.sda;

import com.sda.entyPoints.EntryPoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DependencyConfig.class);
        EntryPoint entryPoint = applicationContext.getBean(EntryPoint.class);
        //entryPoint.executeStudent();
        entryPoint.showStudent(6);
        entryPoint.changeStudent(6,8.00);
        entryPoint.removeStudent(7);

       // entryPoint.executeTeacher();
        entryPoint.showTeacher(1);
        entryPoint.changeTeacher(2,"Proiectare");
        entryPoint.removeTeacher(4);
    }
}
