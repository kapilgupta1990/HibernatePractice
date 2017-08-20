package com.cdac.gist.sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.cdac.gist.persistence.PersistenceUtil;

public class Tester {
	public static void main(String[] args) {
		// Persistence.cre
		EntityManagerFactory emf = PersistenceUtil.getEntityManagerFactory();
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();
		et.begin();
		HelloWorld person = new HelloWorld();
		person.setHid(3);
		person.setMessage("Good morning");
		entityManager.persist(person);
		et.commit();
		entityManager.close();
		System.out.println("Done");
	}
}
