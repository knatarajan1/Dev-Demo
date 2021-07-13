package week1.day2.assignement;

public class MyMobile {
	
	public static void main(String[] args) {
		Mobile honor = new Mobile("Honor 9 N", "5g");
		System.out.println(honor.dispalyMobileDetails());
		System.out.println(honor.Call(8946000788l));
		System.out.println(honor.Call("AMMA"));
		System.out.println("Is 5G: "+honor.check5G());
	}

}
