package com.jspiders.filehandling.SerializationDeserialization;

import java.io.Serializable;
public class Student {
	private static final long serilization UID=IL;
	
	private int id;
	private String name;
	private String email;
	private int age;
	
	public Student(int id, String name, String email, int age) {
		super();
		this.id=id;
		this.email=email;
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return Student("id= "+id+",Name= "+name+ ",Email= "+email+",Age"+age);
	}
}
