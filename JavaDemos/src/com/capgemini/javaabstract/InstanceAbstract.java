package com.capgemini.javaabstract;
abstract class Base
{
	abstract void fun();
}
class Derived extends Base
{
	void fun()
	{
		System.out.println("Derived fun() called.");
	}
}

public class InstanceAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Base obj = new Base(); //An instance / object of the abstract class cannot be created 
		Base obj = new Derived(); //we can have references of the abstract class type
		obj.fun();
	}

}
