package com.capgemini.javapractice;
//conditional statement for >= and <= operator is demonstrated in this program
public class Conditional_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 8, number2 = 7;
		System.out.println("Number1="+number1);
		System.out.println("Number2="+number2);
        if(number1 >= number2)
        {
     	   System.out.println("If Number 1 is Greater than 2 then"
     	   		+ " condition becomes true");
        }
        else
        {
     	   System.out.println("If Number 1 is Less than 2 then "
     	   		+ "Condition is false");
        }

	}

}
