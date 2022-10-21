package com.capgemini.javaabstract;
abstract class Base4
{
	final void fun() // abstract class can have final methods(methods that cannot be overridden)
	{
		System.out.println("Derived fun() called");
	}
}
class Derived4 extends Base4
{
	
}
public class FinalAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Derived();
		b.fun();
	}

}
