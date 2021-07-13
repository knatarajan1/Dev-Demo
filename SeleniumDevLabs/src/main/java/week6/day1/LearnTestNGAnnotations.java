package week6.day1;

import org.testng.annotations.Test;

public class LearnTestNGAnnotations {

	@Test(priority = -1)
	public void eat() {
		System.out.println("Eating");
	}
	@Test(priority = 2)

	public void code() {
		System.out.println("Coding");
	}	
	@Test

	public void sleep() {
		System.out.println("Sleeping");
	}	
	@Test(priority = -2)
	public void repeat() {
		System.out.println("Repeating");
	}
}
