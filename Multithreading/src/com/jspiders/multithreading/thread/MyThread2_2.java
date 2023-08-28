package com.jspiders.multithreading.thread;

public class MyThread2_2 implements Runnable{
@Override
public void run() {
	for  (int i =1;i<=5;i++) {
		System.out.println("My thread 2_2 is running now");
	}
}
}
