package week2.day2;

public class Samsung extends Mobile{
	public Samsung(String make , String modelName, int price) {
		super("Samsung", modelName, price);
		// TODO Auto-generated constructor stub
	}

	public void makeCall(String contact) {
		super.makeCall(contact);
		System.out.println("Call "+contact+ " from my "+this.getClass().getSimpleName()+" Model "+modelName);
	}
	public void makeCall(long phoneNumber) {
		super.makeCall(phoneNumber);
		System.out.println("Connect "+phoneNumber+ " from my "+this.getClass().getSimpleName()+" Model "+modelName);	}
}
