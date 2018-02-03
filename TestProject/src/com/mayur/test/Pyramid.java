package com.mayur.test;

public class Pyramid {

	public static void main(String[] args) {
		int count = 6;
		int number=1;
		for(int i=0 ; i<count;i++){
			for(int j=count;j>i+1;j--){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print("M ");
				
			}
			System.out.println();
		}
		
		for(int i=0;i<count;i++){						
			for(int j=0;j<=i;j++){
				System.out.print("M");	
			}
			System.out.println();			
		}
		
		for(int i=0;i<count;i++){						
			for(int j=count;j>0;j--){
				if(j<=i){
				System.out.print("M");}else{
					System.out.print(" ");
				}
			}
			System.out.println();			
		}
	}

}
