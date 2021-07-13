package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonUtilities.SeleniumBasic;

public class LearnTable extends SeleniumBasic {
	@Test
	public void testTable() {
		WebElement buttonLink = driver.findElement(By.xpath("(//i)[10]"));
		buttonLink.click();
	}
}
