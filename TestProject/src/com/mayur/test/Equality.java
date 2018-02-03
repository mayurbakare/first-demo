package com.mayur.test;


class A{
	public void add(){
		System.out.println("A");
	}
}

interface B{
	public void add();
}


public class Equality extends A implements B {
	public void add(){
		System.out.println("eq");
	}
	public static void main(String[] args) {

		A a=new Equality();
		a.add();
	}

}
