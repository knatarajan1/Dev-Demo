package serviceNowTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import serviceNow.CommonUtilities.BaseSeleniumClass;
import serviceNow.Pages.LoginPage;

public class LoginTest extends BaseSeleniumClass {

	
	private String tableName= "SERVICENOW_LOGIN";
	
	@DataProvider(name="testData")
	public String[][] getData(){
		return getTestData(this.getClass().getSimpleName());
	}
	@Test(dataProvider = "testData")
	public void loginTest(String testCase) {		
		String userName = getData(tableName,testCase,"USERNAME");
		String password=getData(tableName,testCase,"PASSWORD");
		login(userName,password);
	}
	
	private void login(String userName,String password) {
		try {
			new LoginPage().
			pageLoad().
			enterUserName(userName).
			enterPassword(password).
			clickLogin().
			validateHomePage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
