package serviceNow.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import serviceNow.CommonUtilities.BaseSeleniumClass;

public class LoginPage extends BaseSeleniumClass{

	
public LoginPage() {
PageFactory.initElements(driver, this);
}	
@CacheLookup
@FindBy(xpath="//input[@name='user_name']") 
private WebElement userName;
@CacheLookup
@FindBy(xpath="//input[@name='user_password']") 
private WebElement password;
@CacheLookup
@FindBy(xpath="//button[@id='sysverb_login']") 
private WebElement loginButton;

public LoginPage enterUserName(String userName) {
	softAssert.assertTrue(this.userName.isDisplayed());
	this.userName.sendKeys(userName);
	return this;
}
public LoginPage enterPassword(String password) {
	softAssert.assertTrue(this.password.isDisplayed());
	this.password.sendKeys(password);
	return this;
}
public HomePage clickLogin() {
	softAssert.assertTrue(this.loginButton.isDisplayed());
	this.loginButton.click();
	return new HomePage();
}

public LoginPage pageLoad() {
		waitFor(loginButton, "VisibilityOf");
		return this;
	
}
public void login(String userName,String password) {
	try {
		pageLoad().
		enterUserName(userName).
		enterPassword(password).
		clickLogin().
		validateHomePage();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	softAssert.assertAll();
}
}
