package com.capgemini.javapractice;

public class ConditionalStatement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number1 = 10, number2 = 11;
		  
		  if(!(number1 < number2) || (number1 == number2))
		  { 
			  System.out.println("Condition mentioned is TRUE");
		  }
		  else
		  { 
			  System.out.println("Condition mentioned is FALSE"); 
		}
		 	
		int ageOfBoy = 36;
		int ageOfGirl = 25;

		if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) 
		{
			System.out.println("Ready to get married!");
		} 
		else 
		{
			System.out.println("Wait for it kiddo!");
		}

	}

}
