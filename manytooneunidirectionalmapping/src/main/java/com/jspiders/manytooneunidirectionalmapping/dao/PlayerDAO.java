package com.jspiders.manytooneunidirectionalmapping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.manytooneunidirectionalmapping.dto.Player;
import com.jspiders.manytooneunidirectionalmapping.dto.Team;


public class PlayerDAO{

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	private static void openConnection(){
		entityManagerFactory= Persistence.createEntityManagerFactory("player");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();		
	}
	
	private static void closeConnection(){
		if(entityManagerFactory != null) {
			entityManager.close();
		}
		if (entityManager != null){
			entityManager.close();
		}
		if (entityTransaction != null) {
			if (entityTransaction.isActive()){
				entityTransaction.rollback();
				
			}
		}
			
	}
	public static void main(String[] args) {
		
		openConnection();
		entityTransaction.begin();
		
		Player player1= new Player();
		player1.setId(1);
		player1.setName("Ashu");
		player1.setJerseynumber(18);
		player1.setAge(36);
		
		
		Player player2= new Player();
		player2.setId(2);
		player2.setName("Rushi");
		player2.setJerseynumber(18);
		player2.setAge(36);
		
		
		Player player3= new Player();
		player3.setId(3);
		player3.setName("Rammya");
		player3.setJerseynumber(18);
		player3.setAge(36);
		
		
		Team team1= new Team();
		team1.setId(1);
		team1.setName("Team A");
		team1.setCountry("India");
		
		player1.setTeam(team1);
		player2.setTeam(team1);
		player3.setTeam(team1);
	
	
		entityManager.persist(team1);
		entityManager.persist(player1);
		entityManager.persist(player3);
		entityManager.persist(player2);
		
		
		entityTransaction.commit();
		closeConnection();
	}
}