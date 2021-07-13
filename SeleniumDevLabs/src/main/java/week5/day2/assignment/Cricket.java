package week5.day2.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricket {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search']"));
	searchBox.sendKeys("Cricket",Keys.ENTER);
	List<WebElement> cricketWords = driver.findElements(By.xpath("//*[contains(text(),'Cricket') or contains(text(),'cricket')]"));
	
	System.out.println("Total Number of words: "+cricketWords.size());
	driver.quit();
}
}
