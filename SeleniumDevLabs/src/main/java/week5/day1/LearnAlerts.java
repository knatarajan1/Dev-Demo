package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnAlerts {
@Test
public void testMethod() {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://devlabs-860f0.web.app/alert");
	WebElement simple = driver.findElement(By.xpath("//button[text()='Simple']"));
	WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm']"));
	WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt']"));
	WebElement sweet = driver.findElement(By.xpath("//button[text()='Sweet']"));

	System.out.println("************SIMPLE ALERT************");
	simple.click();
	Alert alert = driver.switchTo().alert();
	System.out.println("Simple Alert Text: "+alert.getText());
	alert.accept();
	System.out.println("Simple Alert Accepted");
	simple.click();
	alert = driver.switchTo().alert();
	alert.dismiss();
	System.out.println("Simple Alert Dismissed");
	
	System.out.println("************CONFIRM ALERT************");
	confirm.click();
	alert = driver.switchTo().alert();
	System.out.println("Confirm Alert Text: "+alert.getText());
	alert.accept();
	System.out.println("Confirm Alert Accepted");
	confirm.click();
	alert = driver.switchTo().alert();
	alert.dismiss();
	System.out.println("Confirm Alert Dismissed");
	
	System.out.println("************PROMPT ALERT************");
	prompt.click();
	alert = driver.switchTo().alert();
	System.out.println("Prompt Alert Text: "+alert.getText());
	alert.sendKeys("Hi");
	alert.accept();
	System.out.println("Prompt Alert Accepted");
	prompt.click();
	alert = driver.switchTo().alert();
	alert.sendKeys("Hello");
	alert.dismiss();
	System.out.println("Prompt Alert Dismissed");
	
	System.out.println("************PROMPT ALERT************");
	sweet.click();
	WebElement ok = driver.findElement(By.xpath("//button[text()='OK']"));
	if(ok.isDisplayed() && ok.isEnabled()) {
		System.out.println("Sweet Alert is present");
		ok.click();
	}
	else
		System.err.println("Sweet Alert is not present");
	driver.quit();
}
}
