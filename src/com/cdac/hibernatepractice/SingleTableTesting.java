//package com.cdac.hibernatepractice;
//
//import com.cdac.gist.mapping.inherientence.Contract_Employee;
//import com.cdac.gist.mapping.inherientence.Employee;
//import com.cdac.gist.mapping.inherientence.Regular_Employee;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
///**
// *
// * @author Kapil Gupta <Kapil gupta at CDAC-GIST,Pune>
// */
//public class SingleTableTesting {
//
//    public static void main(String[] args) {
//
//        Session session = HibernateUtil.getSessionFactory().openSession();
//
//        Transaction tx = session.beginTransaction();
//        Employee emp = new Employee();
//        emp.setName("kapil");
//
//        Regular_Employee aparna = new Regular_Employee();
//        aparna.setName("Aparna");
//        aparna.setSalary(71000);
//        aparna.setBonus(10);
//
//        Contract_Employee tushar = new Contract_Employee();
//        tushar.setName("Tushar");
//        tushar.setContract_duration("5");
//        session.save(emp);
//        session.save(aparna);
//        session.save(tushar);
//
//        tx.commit();
//
//        HibernateUtil.closeSessionFactory();
//    }
//
//}
