package com.capgemini.javaabstract;


 class CarFea{
	private String doors;
	private int speed;
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
		if(doors.equals("closed")&& speed >0)
		{
			return "running";
		}
		else
		{
			return "not running";
		}
	}
	
}
 
 public class HelloCar {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			CarFea car = new CarFea();
			car.setDoors("closed");
			car.setSpeed(10);
			System.out.println(car.run());
		}

	}