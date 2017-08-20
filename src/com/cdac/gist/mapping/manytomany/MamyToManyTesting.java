//package com.cdac.gist.mapping.manytomany;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import com.cdac.hibernatepractice.HibernateUtil;
//
///**
// *
// * @author Kapil Gupta <Kapil gupta at CDAC-GIST,Pune>
// */
//public class MamyToManyTesting {
//
//    private static void saveOwnerSide() {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//
//        Subscriber sub1 = new Subscriber("Sub1");
//
//        Subscriber sub2 = new Subscriber("Sub2");
//
//        Subscriber sub3 = new Subscriber("Sub3");
////        sub3.setSubscriberName("sub3");
//        Publisher pub1 = new Publisher("Pub1");
//        Publisher pub2 = new Publisher("Pub2");
//
//        pub1.getSubscribers().add(sub1);
//        pub1.getSubscribers().add(sub2);
//        pub2.getSubscribers().add(sub3);
//
//        session.save(pub1);
//        session.save(pub2);
//
//        tx.commit();
//        session.close();
//
//        HibernateUtil.closeSessionFactory();
//    }
//
//    private static void saveInverseSide() {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//
//        Subscriber sub1 = new Subscriber("Sub4");
//
//        Subscriber sub2 = new Subscriber("Sub5");
//
//        Subscriber sub3 = new Subscriber("Sub6");
////        sub3.setSubscriberName("sub3");
//        Publisher pub1 = new Publisher("Pub4");
//        Publisher pub2 = new Publisher("Pub5");
//
//        sub1.getPublishers().add(pub1);
//        sub2.getPublishers().add(pub1);
//        sub3.getPublishers().add(pub2);
//
//        session.save(sub1);
//        session.save(sub2);
//        session.save(sub3);
//
//        tx.commit();
//        session.close();
//
//        HibernateUtil.closeSessionFactory();
//    }
//
//    private static void getObject() {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//        Subscriber sub1 = new Subscriber();
//        Subscriber publisher = (Subscriber) session.get(Subscriber.class, 1);
//        System.out.println("Publisher " + publisher);
//        tx.commit();
//        session.close();
//
//        HibernateUtil.closeSessionFactory();
//    }
//
//    public static void main(String[] args) {
//        getObject();
//    }
//
//}
