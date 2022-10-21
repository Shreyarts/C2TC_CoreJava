package com.capgemini.javaabstract;
class Super{
	void disp() {
		System.out.println("Super Class");
	}
}
class SubClass extends Super{
	@Override
	void disp() {
		System.out.println("Only Sub Class");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass obj = new SubClass();
		obj.disp();
	}
}
