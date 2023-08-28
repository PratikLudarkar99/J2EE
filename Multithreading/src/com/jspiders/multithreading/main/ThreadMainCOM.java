package com.jspiders.multithreading.main;

import com.jspiders.multithreading.thread.MyThread1_1;
import com.jspiders.multithreading.thread.MyThread2_2;

public class ThreadMainCOM {

	public static void main(String[] args) {
		MyThread1_1 myThread1_1=new MyThread1_1();
		MyThread2_2 myThread2_2=new MyThread2_2();
		Thread thread=new Thread(myThread2_2);
		thread.start();
		thread.start();
	}

}
