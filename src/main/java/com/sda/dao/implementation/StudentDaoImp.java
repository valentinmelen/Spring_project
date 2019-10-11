package com.sda.dao.implementation;

import com.sda.dao.StudentDAO;
import com.sda.entities.Student;
import com.sda.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

@Service
public class StudentDaoImp implements StudentDAO {


    public void addStudent(Student student) {
        System.out.println("Am ajuns in clasa StudentDaoImp");
        try(Session session = HibernateUtils.getSessionFactory().openSession()){
            session.beginTransaction();
            Integer id  = (Integer) session.save(student);
            System.out.println("Student was creates with id: "+id);
            session.getTransaction().commit();
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }

    public Student displayStudentById(Integer id) {
        System.out.println("Am ajuns in clasa StudentDaoImp");
        Student student = null;
        try(Session session = HibernateUtils.getSessionFactory().openSession()){
            student = session.get(Student.class,id);
            if(student!=null){
                System.out.println("Student exist in database. ");
            }else {
                System.out.println("Student does not exist in database.");
            }
        }catch (HibernateException e){
            e.printStackTrace();
        }
        return student;
    }

    public Student updateStudentById(Integer id, Double averageGrade) {
        System.out.println("Am ajuns in clasa StudentDaoImp");
        Student student = null;
        try( Session session = HibernateUtils.getSessionFactory().openSession()){
            student = session.get(Student.class,id);
            if(student !=null){
                student.setAverageGrade(averageGrade);
                session.beginTransaction();
                session.update(student);
                session.getTransaction().commit();
            }else {
                System.out.println("Student was not updated in database.");
            }

        }catch (HibernateException e){
            e.printStackTrace();
        }
        return student;
    }

    public void deleteStudentById(Integer id) {
        System.out.println("Am ajuns in clasa StudentDaoImp");
        try(Session session = HibernateUtils.getSessionFactory().openSession()){
            Student student = session.get(Student.class,id);
            if(student!= null){
                session.beginTransaction();
                session.delete(student);
                session.getTransaction().commit();
            }else {
                System.out.println("Student was not deleted in database.");
            }
        }catch (HibernateException e){
            e.printStackTrace();
        }
    }
}
