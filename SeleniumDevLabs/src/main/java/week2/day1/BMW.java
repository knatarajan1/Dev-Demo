package week2.day1;

public class BMW extends Car{

	public final void autoGear() {
		System.out.println("It has auto gear");
	}
	
	public void autoGear(int i) {
		System.out.println("It has auto gear");
	}
	
	@Override
	public void applyBrake() {
//		super.applyBrake();
		System.out.println("ABS Brake Applied");
	}

}
