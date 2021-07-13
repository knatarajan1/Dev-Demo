package week1.day2.assignement;

public class Car {

	public String carName ;
	public int engineCC;
	public String color;
	
	public Car() {
		System.out.println("Default Constructor");
	}
	public Car(String carName,int engineCC, String color) {
		System.out.println("Parametrized Constructor");
		this.carName=carName;
		this.engineCC=engineCC;
		this.color=color;
	}
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColorName() {
		return this.color;
	}
	public String getColorName(String brandName) {
		return "Blue "+brandName;
	}
	
	public int getColorName(int brandName) {
		return brandName;
	}
	
}
