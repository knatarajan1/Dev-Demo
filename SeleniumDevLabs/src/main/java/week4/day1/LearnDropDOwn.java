package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDOwn {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://devlabs-860f0.web.app/dropdown");
	
	WebElement fruitDD = driver.findElement(By.xpath("//select[@id='Index']"));
	WebElement lifeDD = driver.findElement(By.xpath("//select[@name='text']"));
	WebElement dailyDD = driver.findElement(By.xpath("//button[@id='dropdownBasic1']"));
	WebElement letCode = driver.findElement(By.xpath("//button[text()='Letcode']"));
	//WebElement countryList = driver.findElement(By.xpath("//input[@type='text']"));
	
	Select selectFruit = new Select(fruitDD);
	Select selectLife = new Select(lifeDD);
	//Select selectDaily = new Select(dailyDD);
	//select using Sendkeys
	fruitDD.sendKeys("Mango");
	if(selectFruit.getFirstSelectedOption().getText().equalsIgnoreCase("Mango"))
		System.out.println("Mango is Selected correctly");
	else
		System.err.println("Selection is wrong");
	//Select by Index
	selectLife.selectByIndex(1);
	if(selectLife.getFirstSelectedOption().getText().equalsIgnoreCase("Bad"))
		System.out.println("Bad is Selected correctly");
	else
		System.err.println("Selection is wrong");
	//Select by Visible Text
	selectFruit.selectByVisibleText("Orange");
	if(selectFruit.getFirstSelectedOption().getText().equalsIgnoreCase("Orange"))
		System.out.println("Orange is Selected correctly");
	else
		System.err.println("Selection is wrong");
	//Select by Index
	selectLife.selectByValue("good");
	if(selectLife.getFirstSelectedOption().getText().equalsIgnoreCase("Good"))
		System.out.println("Good is Selected correctly");
	else
		System.err.println("Selection is wrong");
	dailyDD.click();
	if(letCode.isDisplayed()) {
		System.out.println("Daily routine dropdown is clicked");
		letCode.click();
	}
	else
		System.err.println("Daily routine dropdown is not clicked");

	/*selectFruit.deselectByVisibleText("Orange");
	selectLife.deselectByValue("good");
	if(selectFruit.getFirstSelectedOption().getText().equalsIgnoreCase("Select your fav fruit"))
		System.out.println("Select Fruit is deselected");
	else
		System.err.println("Select Fruit is selected");
	if(selectLife.getFirstSelectedOption().getText().equalsIgnoreCase("How's life ?"))
		System.out.println("Select Life is deselected");
	else
		System.err.println("Select Life is selected");*/
	System.out.println("Print Fruits Dropdown Values");
	for (WebElement ele : selectFruit.getOptions()) {
		System.out.println(ele.getText());
	}
	System.out.println("Print Life Dropdown Values");
	for (WebElement ele : selectLife.getOptions()) {
		System.out.println(ele.getText());
	}
	driver.quit();
}

}
