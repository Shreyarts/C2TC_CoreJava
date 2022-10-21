package com.capgemini.javaabstract;
class Car{
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

public class ClassCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj= new Car();
		obj.setSpeed(10);
		System.out.println("Speed of the car is : "+obj.getSpeed());
	}

}
