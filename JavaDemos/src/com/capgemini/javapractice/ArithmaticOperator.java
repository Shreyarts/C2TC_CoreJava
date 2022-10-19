package com.capgemini.javapractice;
//Increment and decrement operators are demonstrated 
public class ArithmaticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 10, number2=20; //declaration of variables and assigning them values
		System.out.println("number1="+number1);
		System.out.println("number2="+number2);
		//Adding two numbers
		System.out.println("Addition of two numbers is:"+ (number1+number2));
		
		//use of increment  and decrement operator 
		System.out.println("After using decrement operator on number1 it becomes "+ --number1);
		System.out.println("After using increment operator on number2 it becomes "+ ++number2);

	}

}
