package com.jspiders.multithreading.thread;

public class MyThread1_1 extends Thread {

	@Override
	public void run() {
		for (int i =1;i <= 5; i++) {
			System.out.println("My Thread 1_1 is now running");
		}
	}
}
