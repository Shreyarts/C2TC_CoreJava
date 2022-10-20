package com.capgemini.javapractice;

public class ForLoopBooleanVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 8;
		System.out.println("Number entered is:"+number);
		boolean isPrime = true;
		for(int i = 2; i < number/2; i++)
		{
			if(number % i == 0)
			{
				isPrime = false;
			}
		}
		if(isPrime == true)
		{
			System.out.println("The number is a prime number");
		}
		else
		{
			System.out.println("The number is not a prime number");
		}

	}

}
