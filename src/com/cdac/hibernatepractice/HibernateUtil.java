//package com.cdac.hibernatepractice;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;
//
///**
// *
// * @author Kapil Gupta <Kapil gupta at CDAC-GIST,Pune>
// */
//public class HibernateUtil {
//
//    private static SessionFactory sessionFactory;
//
//    public static SessionFactory getSessionFactory() {
//        if (sessionFactory == null) {
//            synchronized (HibernateUtil.class) {
//                if (sessionFactory == null) {
//                    Configuration cfg = new Configuration();
//                    cfg.configure("/hibernate.cfg.xml");
//                    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
//                            .applySettings(cfg.getProperties()).buildServiceRegistry();
//                    sessionFactory = cfg.buildSessionFactory(serviceRegistry);
//                }
//
//            }
//        }
//        return sessionFactory;
//    }
//
//    public static void closeSessionFactory() {
//        if(sessionFactory!=null)
//            sessionFactory.close();
//
//    }
//}
