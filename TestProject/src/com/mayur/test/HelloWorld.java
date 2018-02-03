package com.mayur.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HelloWorld {

	public static void main(String[] args) {
		UserObject obj1=new UserObject();
		obj1.setName("mayur2");
		obj1.setId("2");
		
		UserObject obj=new UserObject();
		obj.setName("mayur");
		obj.setId("1");

		HashMap<UserObject,String> testMap1=new HashMap<UserObject,String>();
		testMap1.put(obj, "555");
		testMap1.put(obj1, "22");
		
			
		Iterator it1=testMap1.entrySet().iterator();
		while (it1.hasNext()){
			Map.Entry entty= (Entry) it1.next();
			System.out.println(entty.getValue());
			UserObject o=(UserObject) entty.getKey();
			System.out.println(((UserObject) entty.getKey()).getName());
		}
		
		
	for (Entry<UserObject, String> string : testMap1.entrySet()) {
		System.out.println(string.getKey().getName());
	}
		
		HashMap<String,String> testMap=new HashMap<String,String>();
		testMap.put("mayur", "2");
		
		testMap.put("mayur1", "3");
		
		testMap.put("mayur1", "43");
		
		Iterator it=testMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair= (Entry) it.next();
			System.out.println(pair.getKey());
			System.out.println(pair.getValue());
			
		}
		
		for (String keyset : testMap.keySet()) {
			System.out.println("---"+keyset);
			System.out.println("---"+testMap.get(keyset));
			
		}
		
		System.out.println("Hello Mayur ......");

	}

}
