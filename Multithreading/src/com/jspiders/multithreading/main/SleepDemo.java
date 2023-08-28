package com.jspiders.multithreading.main;

public class SleepDemo {

	public static void main(String[] args) {
		
		String msg="THis is the Sleep ()";
		
		for(int i =0; i<msg.length();i++)
		{
			System.out.println(msg.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
