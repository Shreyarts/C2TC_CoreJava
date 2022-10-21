package com.capgemini.javaabstract;
class StudentName
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentName obj = new StudentName();
		obj.setName("Shreya");
		System.out.println(obj.getName());
	}
}
