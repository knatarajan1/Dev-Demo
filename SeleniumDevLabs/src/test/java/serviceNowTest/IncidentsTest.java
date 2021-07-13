package serviceNowTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import serviceNow.CommonUtilities.BaseSeleniumClass;
import serviceNow.Pages.IncidentsPage;
import serviceNow.Pages.LeftPane;
import serviceNow.Pages.LoginPage;

public class IncidentsTest extends BaseSeleniumClass{
	private String logintableName= "SERVICENOW_LOGIN";
	private String leftPaneTableName = "SERVICENOW_LEFTPANE";
	private String incidentsTable = "SERVICENOW_INCIDENTS";
	@DataProvider(name="testData")
	public String[][] getData(){
		return getTestData(this.getClass().getSimpleName());
	}
	@Test(dataProvider = "testData")
	public void incidentsTest(String testCase) {
		login(testCase);
		navigateTo(testCase);
		incidentsPage(testCase);
	}
	
	private void login(String testCase) {
		String userName = getData(logintableName,testCase,"USERNAME");
		String password=getData(logintableName,testCase,"PASSWORD");
		new LoginPage().login(userName, password);
	}
	
	private void navigateTo(String testCase) {
		String keyword = getData(leftPaneTableName, testCase, "KEYWORD");
		new LeftPane().navigateTo(keyword);
	}
	private void incidentsPage(String testCase) {
		String shortDescription = getData(incidentsTable, testCase, "SHORTDESCRIPTION");
		new IncidentsPage().incidentsValidation(shortDescription);
	}
}
