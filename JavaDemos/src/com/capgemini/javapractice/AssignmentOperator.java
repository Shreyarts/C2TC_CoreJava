package com.capgemini.javapractice;
//In this program assignment operator is demonstrated
public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 4;
		number += 5; // x = x + 5  Adding and assigning the value to the variable
		number -= 5; // x = x - 5  Subtracting and assigning the value to the varaible
		number *= 5; // x = x * 5
		number /= 4; // x = x / 4
		number %= 5; // x = x % 5
		System.out.println("After completing all the operations number becomes:"+ number);

	}

}
