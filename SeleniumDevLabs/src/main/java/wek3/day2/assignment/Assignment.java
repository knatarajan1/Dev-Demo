package wek3.day2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	
	String title = driver.getTitle();
	System.out.println("TITLE: "+title);
	String url = driver.getCurrentUrl();
	System.out.println("CURRENT URL: "+url);
	String pageSource = driver.getPageSource();
	//System.out.println("PAGE SOURCE :"+pageSource);
	
	driver.quit();
	
}
}
