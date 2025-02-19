package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        // open session
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        // create student object
        Student student = new Student("Tanmay Biswas", "btanmoy776@gmail.com");
        session.persist(student);
        // commit transaction
        transaction.commit();
        // close session
        session.close();
        System.out.println("Student saved successfully" + student);

    }
}
