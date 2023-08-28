package com.jspiders.hibernateMapping.onetoone.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernateMapping.onetoone.dto.AadharCard;
import com.jspiders.hibernateMapping.onetoone.dto.Person;

public class PersonDAO {

		private static EntityManagerFactory entityManagerFactory ;
		private static EntityManager entityManager;
		private static EntityTransaction entityTransaction;
		
		
		private static void openConnection() {
			entityManagerFactory = Persistence.createEntityManagerFactory("person");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
		}
		
		private static void closeConnection() {
			if(entityManagerFactory != null) {
				entityManagerFactory.close();
			}
			if (entityManager != null) {
				entityManager.close();
			}
			if (entityTransaction != null) {
				if (entityTransaction.isActive()) {
					entityTransaction.rollback();
				}
			}
		}
		
		public static void main(String[] args) {
			
			openConnection();
			entityTransaction.begin();
			
			Person person= new Person();
			person.setId(1);
			person.setName("Makya");
			person.setEmail("makya@gmail.com");
			
			
			AadharCard aadharCard=new AadharCard();
			aadharCard.setId(1);
			aadharCard.setAadharNumber(154254215421l);
			aadharCard.setDateOfIssue("08/08/1999");
			
			
			person.setAadharCard(aadharCard);
			entityManager.persist(aadharCard);
			entityManager.persist(person);
			
			
			entityTransaction.commit();
			closeConnection();
		}
}
