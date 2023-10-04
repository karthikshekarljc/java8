package com.kc.lambda1;

public class ThreadEx1 {
	
	public static void main(String [] args) {
		Runnable run = ()->{
			String threadName = Thread.currentThread().getName();
			System.out.println("The running thread is :"+threadName);
		};
		
		Thread t = new Thread(run);
		t.start();
		
		Thread t2 = new Thread(run);
		t2.start();
	}

}
