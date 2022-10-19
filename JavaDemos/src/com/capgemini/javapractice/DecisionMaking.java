package com.capgemini.javapractice;
//Making decisions using if else conditional statement in thus program
public class DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		if (number == 5) 
	    { 
			if (number >= 5) 
			{
				System.out.println("X is greater than 5"); 
		    }
		    else 
		    {
		    	System.out.println("X is smaller than 5"); 
		    } 
		 }
		
		if(number == 5)
		{
			System.out.println("X equals to 5");
		}
		else if(number > 5)
		{
			System.out.println("X is greater to 5");		
		}
		else 
		{
			System.out.println("X is smaller than 5");
		}

	}

}
