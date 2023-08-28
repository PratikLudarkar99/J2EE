package com.jspiders.multithreading.main;

import com.jspiders.multithreading.thread.MyThread3;

public class ThreadMain3 {
public static void main(String[] args) {
	MyThread3 myThread3= new MyThread3();
	System.out.println("Name of thread: " +myThread3.getName());
	System.out.println("Priority of thread: " +myThread3.getPriority());
	myThread3.start();
}
}
