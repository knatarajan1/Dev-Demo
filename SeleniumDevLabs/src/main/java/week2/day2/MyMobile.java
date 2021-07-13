package week2.day2;


public class MyMobile {
	public static void main(String[] args) {
		Samsung samsung = new Samsung(null, "M11", 4000);
		samsung.makeCall(8946000788l);
		samsung.makeCall("AMMA");
		samsung.getPrice();
		System.out.println(samsung.getMyNum());		
		System.out.println("*****");
		Mobile mobile = new Samsung(null, "A40", 3500);
		mobile.makeCall(8946000789l);
		mobile.makeCall("Me");
		mobile.getPrice();
		System.out.println(mobile.getMyNum());

		System.out.println("*****");
		Mobile mobile1 = new Mobile("Nokia", "Music Express", 4500);
		mobile1.makeCall(8946000789l);
		mobile1.makeCall("Murthy");
		mobile1.getPrice();
		System.out.println(mobile1.getMyNum());
		
		System.out.println("*****");
		
		Telephone.getMyNumnber();

	}
}
