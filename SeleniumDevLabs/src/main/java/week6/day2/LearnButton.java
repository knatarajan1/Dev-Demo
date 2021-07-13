package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonUtilities.SeleniumBasic;

public class LearnButton extends SeleniumBasic{

	@Test
	public void testButton() {
		WebElement buttonLink = driver.findElement(By.xpath("(//i)[2]"));
		buttonLink.click();
	}
	
}
