package week2.day1;

import week2.day1.Mobile;

public class MyMobile {

	public static void main(String[] args) {
		Mobile honor = new Mobile("Honor 9 N", "5g");
		System.out.println(honor.dispalyMobileDetails());
		System.out.println(Mobile.Call(8946000788l));
		System.out.println(Mobile.Call("AMMA"));
		System.out.println("Is 5G: "+honor.check5G());
	}

}
