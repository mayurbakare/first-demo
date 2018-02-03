package com.mayur.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
class myexception extends RuntimeException{
	
}
class myexception1 extends myexception{
	
}
public class hhh {

	public void add()throws myexception{
		
	}
	public void ass()throws myexception1{
		
	}
	
	public static void main(String[] args) {
		
		hhh h=new hhh();
		try{
		h.add();
		}catch(myexception1 e){
			
		}
	}
}