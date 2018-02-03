package com.mayur.test;

public class AbstractClassDemo extends Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClassDemo mmm=new AbstractClassDemo();
		mmm.run(mmm.abc);
		
	}

	@Override
	public void run(String str) {
		// TODO Auto-generated method stub
		System.out.println("My name is --"+str);
		
	}
}
	
	abstract class Abc {
		public String abc="Mayur";
		/*public A(String a){
			this.abc=a;
		}*/
		
		public abstract void run(String str);
		
		
	}
	
	

