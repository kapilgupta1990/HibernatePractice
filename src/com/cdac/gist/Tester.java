package com.cdac.gist;

import java.util.List;
import java.util.Properties;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tester {
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		properties.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:postgresql://ordpdmgpmdw00.dswh.ds.adp.com:5432/fmr1");
		properties.setProperty("hibernate.connection.username", "bi_user");
		properties.setProperty("hibernate.connection.password", "bi_user");
		Configuration configuration = new Configuration();
		configuration.setProperties(properties);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		System.out.println("Sessin Factory "+sessionFactory);
		Session session = sessionFactory.openSession();
		Query query=session.createNativeQuery("select * from dim_dates limit 2");
		List list=query.getResultList();
		System.out.println(list);
		System.out.println("Done");
	}
}
