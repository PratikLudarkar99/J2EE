package com.jspiders.filehandling.SerializationDeserialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {
		File file=new File("Student.txt");
		if (file.exists()) {
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(new Student(1,"Ram","ram@gmail.com",26));
			
			System.out.println("Object is written to the file");
			
			fileOutputStream.close();
			objectOutputStream.close();
		}else {
			file.createNewFile();
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.write(new Student(1,"Ram","ram@gmail.com",25));
			
			
			System.out.println("Object is written to the file");
			
			fileOutputStream.close();
			objectOutputStream.close();
		}

	}

}
