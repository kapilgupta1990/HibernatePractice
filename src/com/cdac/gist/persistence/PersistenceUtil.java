package com.cdac.gist.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {
	
	private static EntityManagerFactory entityManagerFactory=null;
	
	public static EntityManagerFactory getEntityManagerFactory(){
		if(entityManagerFactory==null)
		{
			synchronized (PersistenceUtil.class) {
				if(entityManagerFactory==null){
					entityManagerFactory = Persistence.createEntityManagerFactory("POSTGRES_JPA");	
				}
			}
		}
			return entityManagerFactory;
	}
	public static EntityManager getEntityManager(){
		return PersistenceUtil.getEntityManagerFactory().createEntityManager();
	}
	public static void close(EntityManager entityManager){
		if(entityManager!=null){
			entityManager.close();
		}
		
	}
	public static void close(EntityManagerFactory entityManagerFactory){
		if(entityManagerFactory!=null){
			entityManagerFactory.close();
		}
		
	}

	

}
