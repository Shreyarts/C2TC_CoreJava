package com.capgemini.collectionex;

import java.util.PriorityQueue;

public class CollectionQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> obj = new PriorityQueue<>();
		obj.add(20);
		obj.add(40);
		obj.add(60);
		obj.add(80);
		obj.add(100);
		System.out.println(obj);
		
		obj.remove();
		System.out.println(obj);
		System.out.println(obj.remove(60));
		System.out.println(obj);
		obj.add(10);
		obj.add(6);
		obj.add(8);
		System.out.println(obj);
	}

}
