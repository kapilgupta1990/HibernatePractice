//package com.cdac.gist.mapping.onetomany.unidirectional;
//
//import java.util.ArrayList;
//import java.util.List;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import com.cdac.hibernatepractice.HibernateUtil;
//
///**
// *
// * @author Kapil Gupta <Kapil gupta at CDAC-GIST,Pune>
// */
//public class ManyToOneTesting {
//
//    public static void saveChild() {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//
//        Book book = new Book();
//        book.setBook("book 4");
//        List<Chapter> chapterList = new ArrayList<>();
//        Chapter chap1 = new Chapter();
//        chap1.setName("chapter 14");
//        chap1.setBook1(book);
//
//        Chapter chap2 = new Chapter();
//        chap2.setName("chapter 24");
//        chap2.setBook1(book);
//
//        Chapter chap3 = new Chapter();
//        chap3.setName("chapter 34");
//        chap3.setBook1(book);
////        chapterList.add(chap1);
////        chapterList.add(chap2);
////        chapterList.add(chap3);
////        book.setChapters(chapterList);
////        session.save(book);
//        session.save(chap1);
//        session.save(chap2);
//        session.save(chap3);
//
//        tx.commit();
//        session.close();
//
//        HibernateUtil.closeSessionFactory();
//    }
//
//    public static void saveParent() {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//
//        Book book = new Book();
//        book.setBook("book 5");
//        List<Chapter> chapterList = new ArrayList<>();
//        Chapter chap1 = new Chapter();
//        chap1.setName("chapter 15");
//        chap1.setBook1(book);
//
//        Chapter chap2 = new Chapter();
//        chap2.setName("chapter 25");
//        chap2.setBook1(book);
//
//        Chapter chap3 = new Chapter();
//        chap3.setName("chapter 35");
//        chap3.setBook1(book);
//        chapterList.add(chap1);
//        chapterList.add(chap2);
//        chapterList.add(chap3);
//        book.setChapters(chapterList);
//        session.save(book);
////        session.save(chap1);
////        session.save(chap2);
////        session.save(chap3);
//
//        tx.commit();
//        session.close();
//
//        HibernateUtil.closeSessionFactory();
//    }
//
//    public static void get() {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//        Book book = (Book) session.get(Book.class, 1);
//        System.out.println("ID " + book.getId());
//        System.out.println("Name " + book.getBook());
//        System.out.println("Chapters " + book.getChapters());
//        tx.commit();
//        session.close();
//
//        HibernateUtil.closeSessionFactory();
//    }
//
//    public static void main(String[] args) {
//        //  saveChild();
//        saveParent();
////        get();
//    }
//}
