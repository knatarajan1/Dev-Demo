package wek3.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DevLabsRadioBtn {
@Test
public void testMethod() {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://devlabs-860f0.web.app/radiobutton");
	WebElement ele1 = driver.findElement(By.id("name1"));
	WebElement ele2 = driver.findElement(By.id("name2"));
	WebElement ele3 = driver.findElement(By.id("name3"));
	
	if(ele1.isDisplayed()) {
		System.out.println("FIRST RADIO BUTTON IS DISPLAYED");
		if(!(ele1.isSelected())){
			System.out.println("FIRST RADIO BUTTON IS NOT SELECTED");
			ele1.click();
			System.out.println("FIRST RADIO BUTTON IS CLICKED");
			if(ele1.isSelected()) {
				System.out.println("FIRST RADIO BUTTON IS SELECTED");
			}
			else {
				System.err.println("FIRST RADIO BUTTON IS NOT SELECTED");
			}
		}
		else {
			System.err.println("FIRST RADIO BUTTON IS NOT SELECTED");
		}
			
	}
	else {
		System.err.println("FIRST RADIO BUTTON IS NOT DISPLAYED");
	}
	if(ele2.isDisplayed()) {
		System.out.println("SECOND RADIO BUTTON IS DISPLAYED");
		if(!(ele2.isSelected())){
			System.out.println("SECOND RADIO BUTTON IS NOT SELECTED");
			ele2.click();
			System.out.println("SECOND RADIO BUTTON IS CLICKED");
			if(ele2.isSelected()) {
				System.out.println("SECOND RADIO BUTTON IS SELECTED");
			}
			else {
				System.err.println("SECOND RADIO BUTTON IS NOT SELECTED");
			}
		}
		else {
			System.err.println("SECOND RADIO BUTTON IS NOT SELECTED");
		}
			
	}
	else {
		System.err.println("SECOND RADIO BUTTON IS NOT DISPLAYED");
	}
	if(ele3.isDisplayed()) {
		System.out.println("THIRD RADIO BUTTON IS DISPLAYED");
		if((ele3.isSelected())){
			System.out.println("THIRD RADIO BUTTON IS SELECTED");
			ele3.click();
			System.out.println("THIRD RADIO BUTTON IS CLICKED");
			if( ! (ele3.isSelected())) {
				System.out.println("THIRD RADIO BUTTON IS NOT SELECTED");
			}
			else {
				System.err.println("THIRD RADIO BUTTON IS SELECTED");
			}
		}
		else {
			System.err.println("THIRD RADIO BUTTON IS  NOT SELECTED");
		}
			
	}
	else {
		System.err.println("THIRD RADIO BUTTON IS NOT DISPLAYED");
	}
	driver.quit();
}
}
