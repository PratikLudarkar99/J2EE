package com.jspiders.filehandling.SerializationDeserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Deserialization {
	public static void main(String[] args) throws IOException {
		File file=new File("Student.txt");
		if (file.exists()) {
			FileInputStream fileInputStream=new FileInputStream(file);
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			objectInputStream.writeObject(new Student(1,"Ram","ram@gmail.com",26));
			
			System.out.println("Object is written to the file");
			
			fileInputStream.close();
			objectInputStream.close();
		}else {
			file.createNewFile();
			FileInputStream fileInputStream=new FileInputStream(file);
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			objectInputStream.write(new Student(1,"Ram","ram@gmail.com",25));
			
			
			System.out.println("Object is written to the file");
			
			fileInputStream.close();
			objectInputStream.close();
		}

	}
}
