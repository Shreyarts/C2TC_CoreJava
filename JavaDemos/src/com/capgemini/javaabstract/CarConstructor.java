package com.capgemini.javaabstract;

class CarFeature{
	private String doors;
	private int speed;
	
	public CarFeature() {
		doors ="opened";
		speed = 0;
	}

	
	public CarFeature(String doors, int speed) {
		
		this.doors = doors;
		this.speed = speed;
	}


	public String getDoors() {
		return doors;
	}


	public void setDoors(String doors) {
		this.doors = doors;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String run() {
		if(doors.equals("closed") && speed>0) {
			return "running";
		}
		else
		{
			return "not running";
		}
	}
}

public class CarConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFeature car=new CarFeature("closed",10);
		System.out.println(car.run());
	}

}
