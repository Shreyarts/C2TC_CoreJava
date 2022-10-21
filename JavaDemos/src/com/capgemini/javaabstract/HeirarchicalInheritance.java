package com.capgemini.javaabstract;
class One1{
	void disp1()
	{
		System.out.println("One");
	}
}
class Two2 extends One1{
	void disp2()
	{
		System.out.println("Two");
	}
}
class Three extends One1{
	void disp3()
	{
		System.out.println("Three");
	}
}
class Four extends One1{
	void disp4()
	{
		System.out.println("Four");
	}
}

public class HeirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Four obj1 = new Four();
		obj1.disp1();
		obj1.disp4();
		
		Three obj2 = new Three();
		obj2.disp1();
		obj2.disp3();
		
		Two2 obj3 = new Two2();
		obj3.disp1();
		obj3.disp2();
	}

}
