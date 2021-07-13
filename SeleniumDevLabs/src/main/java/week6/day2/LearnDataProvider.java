package week6.day2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonUtilities.ReadExcel;

public class LearnDataProvider {

	@DataProvider(name="getData")
	public String[][] getData() {
		String[][] testData= new String[2][2];
		
		testData[0][0] = ReadExcel.getData("Login", "TC1", "USERNAME");
		testData[0][1] = ReadExcel.getData("Login", "TC1", "PASSWORD");
		testData[1][0] = ReadExcel.getData("Login", "TC2", "USERNAME");
		testData[1][1] = ReadExcel.getData("Login", "TC2", "PASSWORD");
		return testData;
	}
	@Test(dataProvider = "getData")
	public void test(String userName,String password) {
		System.out.println("USERNAME: "+userName+" PASSWORD: "+password);
	}
}
