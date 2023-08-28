package com.jspiders.multithreading.main;

import com.jspiders.multithreading.thread.MyThread31;

public class ThreadMain31 {

	public static void main(String[] args) {
		MyThread31 myThread3=new MyThread31();
		myThread3.setName("Thread 8");
		myThread3.setPriority(10);
		myThread3.start();
	}

}
