package com.capgemini.javapractice;
//All the three looping statements are demonstrated here
public class AllFlowControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for loop
		  for(int firstNumber=1,secondNumber=1; firstNumber<10||secondNumber<10;firstNumber++,secondNumber++)
		  { 
			  secondNumber++;
			  System.out.println("firstNumber="+ firstNumber +" and secondNumber=" +secondNumber); 
		  }	


		  // while loop 
			  int thirdNumber=1,fourthNumber=1;
			  while(thirdNumber<10 || fourthNumber<10)
			  { 
				  thirdNumber++; 
				  fourthNumber++;
			      System.out.println("FirstNumber="+thirdNumber+" and SecondNumber="+fourthNumber); 
			  }	
			
		 // Do while loop
			int firstNumber=1,secondNumber=1;
			do {
					firstNumber++;
					secondNumber++;
					System.out.println("firstNumber=" + firstNumber + " and secondNumber=" + secondNumber);
			    } while (firstNumber < 10 || secondNumber < 10); 
		}
		
	

	}


