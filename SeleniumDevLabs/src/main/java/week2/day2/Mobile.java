package week2.day2;

public class Mobile implements Telephone {
	public String modelName;
	public String make;
	public int price;
	
	@Override
	public void makeCall(String contact) {
		System.out.println("Call "+contact);
	}
	@Override
	public void makeCall(long phoneNumber) {
		System.out.println("Connect "+phoneNumber);
	}
	public Mobile(String make, String modelName, int price) {
		this.modelName = modelName;
		this.make = make;
		this.price = price;
	}
	
	public final void getPrice() {
		System.out.println("Price is "+price);
	}


}
