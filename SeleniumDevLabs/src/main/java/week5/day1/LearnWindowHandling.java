package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnWindowHandling {
@Test
public  void testMethod() {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://the-internet.herokuapp.com/windows");
	WebElement clickHere = driver.findElement(By.linkText("Click Here"));
	System.out.println("TITLE: "+driver.getTitle());
	System.out.println("URL: "+driver.getCurrentUrl());
	clickHere.click();
	String parentWin = driver.getWindowHandle();
	Set<String> windows = driver.getWindowHandles();
	List<String> windowsList = new ArrayList<>(windows);
	for (String string : windowsList) {
		if(! string.equals(parentWin)) {
			driver.switchTo().window(string);
			System.out.println("New Window TITLE: "+driver.getTitle());
			System.out.println("New Window URL: "+driver.getCurrentUrl());
			driver.close();
		}
	}
	driver.switchTo().window(parentWin);
	System.out.println("TITLE: "+driver.getTitle());
	System.out.println("URL: "+driver.getCurrentUrl());
	driver.quit();
}
}
