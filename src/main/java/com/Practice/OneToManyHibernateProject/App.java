package com.Practice.OneToManyHibernateProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name, email, phone of a student: ");
        Student student = new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        
        System.out.println("Enter name of 3 courses: ");
        Course course1 = new Course(scanner.nextLine(), student);
        Course course2 = new Course(scanner.nextLine(), student);
        Course course3 = new Course(scanner.nextLine(), student);
        
        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        
        student.setCourses(courses);
        
        // Hibernate steps:
        // load the configuration file and create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        // open sesson
        Session session = factory.openSession();
        
        // begin transaction
        Transaction tx = session.beginTransaction();
        
        // save the student object
        session.persist(student);
        
        // commit transaction
        tx.commit();
        
        // close session ans session factory
        session.close();
        factory.close();
        scanner.close();
    }
}
