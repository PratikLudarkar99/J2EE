package com.jspiders.multithreading.main;


import com.jspiders.multithreading.thread.MyThread1_1;
import com.jspiders.multithreading.thread.MyThread2_2;


public class ThreadMain2 {
public static void main(String[] args) {
	MyThread1_1 myThread1=new MyThread1_1();
	MyThread2_2 myThread2=new MyThread2_2();
	Thread thread=new Thread(myThread2);
	myThread1.start();
	thread.start();
}
}
