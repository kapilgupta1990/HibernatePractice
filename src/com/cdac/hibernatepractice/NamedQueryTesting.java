//package com.cdac.hibernatepractice;
//
//import com.cdac.gist.mapping.inherientence.Regular_Employee;
//import com.cdac.gist.mapping.onetoone.Person;
//
//import java.util.List;
//import org.hibernate.Criteria;
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
///**
// *
// * @author Kapil Gupta <Kapil gupta at CDAC-GIST,Pune>
// */
//public class NamedQueryTesting {
//
//    public static void main(String[] args) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//
////        Query query = session.getNamedQuery("GET_EMPLOYEE_BY_ID");
////        query.setParameter("id", 2);
////        Query query = session.getNamedQuery("GET_EMPLOYEE_BY_ID_NativeSql");
//////        query.setParameter("id", 31);
////        Person re = (Person) query.uniqueResult();
////        System.out.println("Regular Employee " + re);
//        Criteria criteria= session.createCriteria(Person.class);
//        //criteria.
//        List<Person> persons=criteria.list();
//        System.out.println(persons);
//        tx.commit();
//        session.close();
//        HibernateUtil.closeSessionFactory();
//    }
//}
