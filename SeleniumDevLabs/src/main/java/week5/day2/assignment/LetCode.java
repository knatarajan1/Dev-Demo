package week5.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCode {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://letcode.in/signup");
	WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
	WebElement mail = driver.findElement(By.xpath("//input[@name='email']"));
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	WebElement agree = driver.findElement(By.xpath("//input[@id='agree']"));
	WebElement signup = driver.findElement(By.xpath("//button[t]"));
}
}
