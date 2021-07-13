package week2.day1;

public class MyCar {

	public static void main(String[] args) {
		BMW bmw = new BMW();
		bmw.autoGear(1);
		bmw.FuelTypes("petrol");
		System.out.println(bmw.noOfTyres);
		bmw.applyBrake();
		bmw.mustBeInsured();

	}
}
