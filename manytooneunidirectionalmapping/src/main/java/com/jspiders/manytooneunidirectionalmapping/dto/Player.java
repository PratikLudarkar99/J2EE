package com.jspiders.manytooneunidirectionalmapping.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Player{
	@Id
	private int id;
	private String name;
	private int Jerseynumber;
	private int age;
	@ManyToOne
	private Team team;
}