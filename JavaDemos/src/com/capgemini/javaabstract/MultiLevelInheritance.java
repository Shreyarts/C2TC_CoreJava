package com.capgemini.javaabstract;
class First{
	void disp1()
	{
		System.out.println("One");
	}
}
class Second extends First{
	void disp2()
	{
		System.out.println("Two");
	}
}
class Third extends Second{
	void disp3()
	{
		System.out.println("Three");
	}
}
class Fourth extends Third{
	void disp4()
	{
		System.out.println("Four");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fourth obj1 = new Fourth();
		obj1.disp1();
		obj1.disp2();
		obj1.disp3();
		obj1.disp4();
	}

}
