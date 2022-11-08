package com.capgemini.multithreading;

class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse Thread name is "+Thread.currentThread().getName());
		System.out.println("Eclipse Thread ID is "+Thread.currentThread().getId());
	}
}

class Calculator extends Thread{
	public void run() {
		System.out.println("Calculator Thread name is "+Thread.currentThread().getName());
		System.out.println("Calculator Thread ID is "+Thread.currentThread().getId());
	}
}

class Chrome extends Thread{
	public void run() {
		System.out.println("Chrome Thread name is "+Thread.currentThread().getName());
		System.out.println("Chrome Thread ID is "+Thread.currentThread().getId());
	}
}

class OneNote extends Thread{
	public void run() {
		System.out.println("OneNote Thread name is "+Thread.currentThread().getName());
		System.out.println("OneNote Thread ID is "+Thread.currentThread().getId());
	}
}

public class MultiThreadByExtendingThreadClassStartMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse e=new Eclipse();
		e.start();
		
		Calculator c= new Calculator();
		c.start();
		
		Chrome ch=new Chrome();
		ch.start();
		
		OneNote o=new OneNote();
		o.start();
		
		System.out.println("Main Method Thread name is "+Thread.currentThread().getName());
		System.out.println("Main Method Thread ID is "+Thread.currentThread().getId());
		
				
	}

}
