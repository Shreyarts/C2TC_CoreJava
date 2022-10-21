package com.capgemini.javaabstract;
abstract class Base1{
	Base1() //abstract class can contain constructors in java
	{
		System.out.println("Base Constructor Called.");
	}
	abstract void fun();
}
class Derived1 extends Base1{
	Derived1()
	{
		System.out.println("Derived constructor called.");
	}
	void fun()
	{
		System.out.println("Derived fun() called");
	}
}
public class ConstructorAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived1 obj = new Derived1(); //constructor of the abstract class is called when an 
		obj.fun();  //instance/object of of inherited class is created
	}

}
