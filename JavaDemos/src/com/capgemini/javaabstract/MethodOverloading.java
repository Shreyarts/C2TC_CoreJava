package com.capgemini.javaabstract;

public class MethodOverloading {

	void add(int x,int y)
	{
		System.out.println("Addition is "+(x+y));
	}
	void add(int x,int y, int z)
	{
		System.out.println("Addition is "+(x+y+z));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.add(5, 4);
		obj.add(6, 5, 4);
	}

}
