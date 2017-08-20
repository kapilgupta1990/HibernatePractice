//package com.cdac.gist.mapping.onetoone;
//
//import org.hibernate.LockMode;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;
//
//import com.cdac.hibernatepractice.HibernateUtil;
//
///**
// *
// * @author Kapil Gupta <Kapil gupta at CDAC-GIST,Pune>
// */
//public class OneToOneTesting {
//
//    public static void main(String[] args) {
//
//        Session session = HibernateUtil.getSessionFactory().openSession();
//
//        Transaction tx = session.beginTransaction();
//        Person p = new Person();
//        p.setId(32);
//        p.setName("kapil");
//
//        PersonDetails pDetails = new PersonDetails();
//        pDetails.setId(42);
//        pDetails.setFatherName("suresh chand");
//        p.setpDetails(pDetails);
//        pDetails.setPerson(p);
////        p.setpDetails(pDetails);
//        session.save(pDetails);
//        tx.commit();
//        session.close();
//
////        session = HibernateUtil.getSessionFactory().openSession();
////        tx = session.beginTransaction();
////        p = (Person) session.get(Person.class, 31);
////        System.out.println("Person P" + p);
////        tx.commit();
////
////        System.out.println("record modified @TestClient1");
////        session.close();
//        HibernateUtil.closeSessionFactory();
//    }
//}
