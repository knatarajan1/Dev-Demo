package week5.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndFDrop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://devlabs-860f0.web.app/aui");
	WebElement src = driver.findElement(By.id("draggable"));
	WebElement trg = driver.findElement(By.id("droppable"));
	Actions action = new Actions(driver);
	action.dragAndDrop(src, trg).build().perform();
	driver.get("https://jqueryui.com/draggable/");
	driver.switchTo().frame("//iframe");
	Point location = src.getLocation();
	action.dragAndDropBy(src, location.getX()+10, location.getY()+10);

}
}
