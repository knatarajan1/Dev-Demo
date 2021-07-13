package serviceNow.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import serviceNow.CommonUtilities.BaseSeleniumClass;

public class HomePage extends BaseSeleniumClass{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(xpath="//div[text()='Power your workflow applications']")
	private WebElement text;
	
	public HomePage validateHomePage() throws Exception{
		driver.switchTo().frame("gsft_main");
		waitFor(text, "VisibilityOf");
		softAssert.assertTrue(text.isDisplayed());
		softAssert.assertAll();
		return this;
		/*if(text.isDisplayed()) {
			driver.switchTo().defaultContent();
			return this;
		}
		else {
			throw new Exception();
		}*/
			
	}
	
	
}
