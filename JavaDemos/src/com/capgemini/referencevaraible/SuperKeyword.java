package com.capgemini.referencevaraible;

	class Car{  
		String color="Brown";  
	}  
	class BMW extends Car{  
		String color="White";
		
		void printColor(){  
			
			System.out.println(color); 
			System.out.println(super.color);  
		}  
	}  
 class SuperKeyword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			BMW d=new BMW();  
			d.printColor();  
			}
	}


