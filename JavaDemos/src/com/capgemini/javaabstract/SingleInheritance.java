package com.capgemini.javaabstract;
class One{
	void disp1()
	{
		System.out.println("One");
	}
}
class Two extends One{
	void disp2()
	{
		System.out.println("Two");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two obj = new Two();
		obj.disp1();
		obj.disp2();
	}

}
