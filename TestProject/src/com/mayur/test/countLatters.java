package com.mayur.test;

import java.util.MissingFormatArgumentException;

public class countLatters {

	public static void main(String[] args) {
		 String s = "aaaaabbcccccc";
	        for(int i=0;i<s.length();i++)
	        {
	            
	            System.out.print(s.charAt(i)+""+(s.lastIndexOf(s.charAt(i))-s.indexOf(s.charAt(i))+1));
	            i = s.lastIndexOf(s.charAt(i));
	            
	        }
	}
	
}
