package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com");
	WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	if(searchBox.isDisplayed()) {
		searchBox.sendKeys("One Plus",Keys.ENTER);
		List<WebElement> listOfItems = driver.findElements(By.xpath("//div[contains(@class,'s-main-slot')]//a[contains(@class,'a-link-normal') and contains(@href,'OnePlus')]//span[contains(text(),'One')]"));
		System.out.println("Search List:");
		if(listOfItems.size()>0) {
			for (WebElement webElement : listOfItems) {
				System.out.println(webElement.getText());
			}
		}
		else
			System.err.println("No Search List Visible");
		
	}
	else
		System.err.println("Amazon Website dint get loaded");
	
	driver.quit();
}
}
