package com.jspiders.multithreading.thread;

public class MyThread31 extends Thread{
@Override
public void run() {
	System.out.println("Thread Name: "+this.getName());
	System.out.println("The priority of Thread: "+this.getPriority());
}
}
