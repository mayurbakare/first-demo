package com.mayur.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class as implements Runnable{
	@Override
	public void run() {
	System.out.println("--"+ Thread.currentThread().getName());		
	}
}
public class DeadLock {

	public static void main(String[] args) {
		ExecutorService execute=Executors.newFixedThreadPool(5);
		
		for(int i=0;i<10;i++){
			execute.execute(new as());
		}
		execute.shutdown();
		
	}
	
}
