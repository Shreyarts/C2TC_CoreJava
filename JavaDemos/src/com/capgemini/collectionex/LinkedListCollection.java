package com.capgemini.collectionex;

import java.util.LinkedList;

public class LinkedListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> obj1= new LinkedList<>();
		obj1.add("Rohit");
		obj1.add("KLRahul");
		obj1.add("Virat");
		obj1.add("Hardik");
		obj1.add("Sachin");
		obj1.add("Suryakumar");
		obj1.add("Chahal");
		
		System.out.println(obj1);
		obj1.remove();
		System.out.println(obj1);
		obj1.remove(1);
		System.out.println(obj1);
		obj1.add(3, "Bumrah");
		System.out.println(obj1);
		obj1.set(3, "Virat");
		System.out.println(obj1);
	}

}
