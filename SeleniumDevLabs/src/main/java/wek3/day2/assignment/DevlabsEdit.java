package wek3.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DevlabsEdit {
@Test
	public  void testMethod() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devlabs-860f0.web.app/edit");
		driver.findElement(By.id("fullName")).sendKeys("Karthikeyan Kandhasamy Natarajan");
		driver.findElement(By.id("join")).sendKeys(" But Evil",Keys.TAB);
		System.out.println("Value Inside the Text Box Appended: "+driver.findElement(By.id("join")).getAttribute("value"));
		System.out.println("Value Inside the Text Box: "+driver.findElement(By.id("getMe")).getAttribute("value"));
		driver.findElement(By.id("clearMe")).clear();
		if (driver.findElement(By.id("clearMe")).getAttribute("value").isEmpty()) 
			System.out.println("Text Inside the Text Box is cleared");
		else
			System.err.println("Text Inside the Text Box is not cleared");
		if(!(driver.findElement(By.id("noEdit")).isEnabled()))
			System.out.println("Text Box is Disbaled");
		else
			System.out.println("Text Box is Enabled");
		if(driver.findElement(By.tagName("h1")).getText().equals("Mostly with Inputs")) 
			System.err.println("Text Matching");
		else
			System.err.println("Text Mis-Matching");
		driver.quit();
	}
	
}
