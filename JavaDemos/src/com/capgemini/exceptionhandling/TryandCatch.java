package com.capgemini.exceptionhandling;

public class TryandCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[7];
		
		System.out.println(a[1]);
		
		try {
			System.out.println(a[9]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Please enter the valid index number.");
		}
		finally {
			System.out.println(a[3]);
		}
	}

}
