package week2.day1;

public class Car extends Vehicle{

	public int noOfTyres = 4;
	
	public final void FuelTypes(String fuel) {
		if(fuel.equals("petrol")) {
			System.out.println("Its a petrol car");
		}else {
			System.out.println("Its a disel car");
		}
	}
}
