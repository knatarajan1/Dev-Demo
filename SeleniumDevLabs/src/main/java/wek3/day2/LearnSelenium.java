package wek3.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnSelenium {
	@Test
	public  void testMethod() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.get("https://devlabs-860f0.web.app/");
		String expecetdTitle = "Workspace";
		if(driver.getTitle().equals(expecetdTitle))
			System.out.println("TC Passed");
		else
			System.out.println("TC Failed");
		driver.navigate().to("https://www.google.com");
		expecetdTitle = "Google";
		if(driver.getTitle().equals(expecetdTitle))
			System.out.println("TC Passed");
		else
			System.out.println("TC Failed");
		driver.navigate().back();
		 expecetdTitle = "Workspace";
		if(driver.getTitle().equals(expecetdTitle))
			System.out.println("TC Passed");
		else
			System.out.println("TC Failed");
		driver.navigate().refresh();
		driver.navigate().forward();
		expecetdTitle = "Google";
		if(driver.getTitle().equals(expecetdTitle))
			System.out.println("TC Passed");
		else
			System.out.println("TC Failed");
		driver.quit();
	}

}
