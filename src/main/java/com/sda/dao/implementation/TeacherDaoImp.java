package com.sda.dao.implementation;


import com.sda.dao.TeacherDAO;
import com.sda.entities.Teacher;
import com.sda.utils.HibernateUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

@Service
public class TeacherDaoImp implements TeacherDAO {


    public void addTeacher(Teacher teacher) {
        System.out.println("Am ajuns in clasa TeacherDaoImp");
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.beginTransaction();
            Integer id = (Integer) session.save(teacher);
            System.out.println("Teacher was creates with id: " + id);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public Teacher displayTeacherById(Integer id) {
        System.out.println("Am ajuns in clasa TeacherDaoImp");
        Teacher teacher = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            teacher = session.get(Teacher.class, id);
            if (teacher != null) {
                System.out.println("Teacher exist in database.");
            } else {
                System.out.println("Teacher does not exist in database.");
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return teacher;
    }

    public Teacher updateTeacherById(Integer id, String discipline) {
        System.out.println("Am ajuns in clasa TeacherDaoImp");
        Teacher teacher = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            teacher = session.get(Teacher.class, id);
            if (teacher != null) {
                teacher.setDiscipline(discipline);
                session.beginTransaction();
                session.update(teacher);
                session.getTransaction().commit();
            }else {
                System.out.println("Teacher was not updated in database.");
            }
        }catch (HibernateException e){
            e.printStackTrace();
        }
        return teacher;
    }

    public void deleteTeacherById(Integer id) {
        System.out.println("Am ajuns in clasa TeacherDaoImp");
        try(Session session = HibernateUtils.getSessionFactory().openSession()){
            Teacher teacher = session.get(Teacher.class,id);
            if(teacher!=null){
                session.beginTransaction();
                session.delete(teacher);
                session.getTransaction().commit();
            }
            else {
                System.out.println("Teacher was not deleted in database.");
            }
        }
    }
}
