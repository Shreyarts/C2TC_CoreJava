package com.capgemini.javaabstract;
abstract class Base2
{
	void disp() //we can create an abstract class without abstract method
	{
		System.out.println("Base disp() called");
	}
}
class Derived2 extends Base2
{
	
}
public class AbstractClassWithoutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived2 d = new Derived2(); //abstract class without abstract method cannot be instantiated 
		d.disp();  //but can only be inherited
		
	}

}
