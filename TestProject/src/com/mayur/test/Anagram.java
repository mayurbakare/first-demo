package com.mayur.test;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String st1="mayur";
	String st2="mhjuy";
	
	if(st1.length() != st2.length()){
		System.out.println("NO anagram");
	}else{
		
		char[] str1= st1.toCharArray();
		
		char[] str2= st2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		
		boolean value=Arrays.equals(str1, str2);
		if(value){
			System.out.println("Anagram");
		}else{
			System.out.println("NO s= Anagram");
		}
		
	}
	
}
	
	
	
	
}
