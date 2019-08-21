package com.collaber.threads;

public class ThreadRunner {

	public static void main(String[] args) {
		
		Runnable r = new NumberCounter();

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
//		Thread t1 = new Thread(new NumberCounter());
//		Thread t2 = new Thread(new NumberCounter());
//		Thread t3 = new Thread(new NumberCounter());
		

		
		
		t1.start();
		t2.start();
		t3.start();

	}

}


