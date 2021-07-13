package serviceNow.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import serviceNow.CommonUtilities.BaseSeleniumClass;

public class LeftPane extends BaseSeleniumClass {
	
	public LeftPane() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(xpath="//nav[@class='navpage-nav']//input[@id='filter']")
	private WebElement searchBox;
	
	public LeftPane search(String keyWord) {
		waitFor(searchBox, "VisibilityOf");
		softAssert.assertTrue(this.searchBox.isDisplayed());
		searchBox.sendKeys(keyWord);
		return this;
	}
	
	public Object clickKeyword(String keyword) {
		driver.findElement(By.xpath("(//span[text()='Self-Service']//following::div[text()='{value}'])[1]".replace("{value}", keyword))).click();
		if(keyword.equalsIgnoreCase("Incidents"))
			return new IncidentsPage();
		else
			return this;
	}
	
	public void navigateTo(String keyword) {
		 search(keyword).clickKeyword(keyword);
		 softAssert.assertAll();
	}
}
