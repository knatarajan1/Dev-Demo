package serviceNow.CommonUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


public class CommonUtilities {

	protected static WebDriver driver;
	private static String filePath = "./ServiceNowData/SERVICENOW.xlsx";
	public static SoftAssert softAssert = new SoftAssert();
	public String getData(String tableName,String testCase,String column){
		String value=null;
		try {
			Workbook workBook = getWorkBook();
			Sheet sheet = workBook.getSheet(tableName);
			value = sheet.getRow(getRowIndex(sheet, testCase)).getCell(getColumnIndex(sheet, column)).getStringCellValue();
		}
		catch(Exception e) {
			value=null;
			System.out.println(e);
		}
		return value;
	}
	private Workbook getWorkBook() {
		Workbook workBook = null;
		try {
			File inputFile = new File(filePath);
			
			FileInputStream inputStream = new FileInputStream(inputFile);
			String fileName = filePath.replace("./", "").trim();
		    String fileExtensionName = fileName.substring(fileName.indexOf("."));
		    if(fileExtensionName.equalsIgnoreCase(".xlsx"))
		    	workBook = new XSSFWorkbook(inputStream);
		    else if(fileExtensionName.equalsIgnoreCase(".xlsx"))
		    	workBook = new HSSFWorkbook(inputStream);
		}
		catch (Exception e) {
			System.out.println(e);
			workBook=null;
		}
		return workBook;
	}
	private int getRowIndex(Sheet sheet,String testCase) {
		int index=-1;
		try {
			int lastRowNum= sheet.getLastRowNum();
			for(int i=1;i<=lastRowNum;i++) {
				if(sheet.getRow(i).getCell(0).getStringCellValue().equals(testCase)) {
					index=i;
					break;
				}
					
			}
		}
		catch(Exception e) {
			index=-1;
			System.out.println(e);
		}
		return index;
	}
	
	private int getColumnIndex(Sheet sheet, String column) {
		int index=-1;
		try {
			int lastColumnNumber= sheet.getRow(0).getLastCellNum();
			for(int i=1;i<=lastColumnNumber;i++) {
				if(sheet.getRow(0).getCell(i).getStringCellValue().equals(column)) {
					index=i;
					break;
				}	
			}
		}
		catch(Exception e) {
			index=-1;
			System.out.println(e);
		}
		return index;
	}
	
	public void waitFor(WebElement element,String waitCondition) {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		switch (waitCondition) {
		case "VisibilityOf":
			wait.until(ExpectedConditions.visibilityOf(element));
			break;
		case "InvisibilityOf":
			wait.until(ExpectedConditions.invisibilityOf(element));
			break;
		case "VisibilityOfText":
			wait.until(ExpectedConditions.textToBePresentInElement(element, waitCondition));

		default:
			break;
		}
	}
	
	public void waitFor(WebElement element,String waitCondition,String text) {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		switch (waitCondition) {
		case "VisibilityOfText":
			wait.until(ExpectedConditions.textToBePresentInElement(element, text));

		default:
			break;
		}
	}
	
	public void advancedUIActions(WebElement element, String actions) {
		Actions action = new Actions(driver);
		switch (actions) {
		case "rightclick":
			action.contextClick(element).build().perform();	
			break;

		default:
			break;
		}
	}
	
	public String[][] getTestData(String className) {
		String[][] testData = new String[5][1]; 
		int tableIndex=0;
		try {
			Workbook workBook = getWorkBook();
			Sheet sheet = workBook.getSheet("SERVICENOW_TEST_MAPPING_MATRIX");
			int lastRowNum = sheet.getLastRowNum();
			for(int index=1;index<=lastRowNum;index++) {
				if(index>5)
					break;
				String value = sheet.getRow(index).getCell(0).getStringCellValue();
				if(value.equals(className)) {
					testData[tableIndex][0]=sheet.getRow(index).getCell(1).getStringCellValue();
					tableIndex++;
				}
			}
			tableIndex=0;

		}
		catch(Exception ex) {
			System.out.println(ex);
			testData=null;
		}
		int rows=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<1;j++) {
				if(!(testData[i][j]==null)) {
					rows++;
				}
			}		
		}
		String newTestData[][] = new String [rows][1];
		try {
			for(int i=0;i<4;i++) {
				for(int j=0;j<1;j++) {
					if(!(testData[i][j]==null))  {
						newTestData[tableIndex][0]=testData[i][j];
						tableIndex++;
					}
				}		
			}
		}
		catch(Exception ex) {
			System.out.println(ex);
			newTestData= null;
		}
		return newTestData;
	}
}
