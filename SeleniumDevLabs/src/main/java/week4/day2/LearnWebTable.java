package week4.day2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://devlabs-860f0.web.app/table");
	
	WebElement table = driver.findElement(By.xpath("//table[@id='table']"));
	

	List<WebElement> numberOfRows = table.findElements(By.xpath("//tbody//tr"));
	
	for(int index=0;index<numberOfRows.size();index++) {
		
		WebElement row = numberOfRows.get(index);
		List<WebElement> colns = row.findElements(By.tagName("td"));
		for(int index1=0;index1<colns.size()-1;index1++) {
			System.out.print(colns.get(index1).getText()+" ");
			if(index==0 && colns.get(index1).getText().equalsIgnoreCase("Koushik")) {
				System.out.println("Koushik Marked Present");
				row.findElement(By.xpath("//td[4]")).click();
			}	
		}
		System.out.println();
	}
driver.quit();
}
}
