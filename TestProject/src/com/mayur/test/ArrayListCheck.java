package com.mayur.test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ClassA {
	
	public void say() throws IOException
	{
		System.out.println("Class A");
	}
	
	public void say1() 	{
		System.out.println("Class A1");
	}
	
}
class ClassB extends ClassA{

	public void say() throws NullPointerException
	{
		System.out.println("Class B");
	}
	
}



public class ArrayListCheck {

	public static void main(String[] args) throws IOException {
		ClassB A = new ClassB();
		A.say1();
	}

}
