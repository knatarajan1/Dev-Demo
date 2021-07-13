package week2.day2;

public interface Telephone {

	public static final long myNumber = 8946000788l;
	
	public void makeCall(String contact);
	public void makeCall(long phoneNumber);
	
	public static void getMyNumnber() {
		System.out.println("My Number is "+myNumber);
	}
	
	default long getMyNum() {
		return myNumber;
	}
	

}
