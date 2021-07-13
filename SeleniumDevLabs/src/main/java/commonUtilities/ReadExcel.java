package commonUtilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;


public class ReadExcel {
	private static String filePath = "./Data/TestData.xlsx";

	public static String getData(String tableName,String testCase,String column){
		String value=null;
		Workbook workBook = getWorkBook();
		Sheet sheet = workBook.getSheet(tableName);
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		value = sheet.getRow(getRowIndex(sheet, testCase)).getCell(getColumnIndex(sheet, column)).getStringCellValue();
		return value;
	}
	private static Workbook getWorkBook() {
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
	private static int getRowIndex(Sheet sheet,String testCase) {
		int index=-1;
		int lastRowNum= sheet.getLastRowNum();
		for(int i=1;i<=lastRowNum;i++) {
			if(sheet.getRow(i).getCell(0).getStringCellValue().equals(testCase)) {
				index=i;
				break;
			}
				
		}
		return index;
	}
	
	private static int getColumnIndex(Sheet sheet, String column) {
		int index=-1;
		int lastColumnNumber= sheet.getRow(0).getLastCellNum();
		for(int i=1;i<=lastColumnNumber;i++) {
			if(sheet.getRow(0).getCell(i).getStringCellValue().equals(column)) {
				index=i;
				break;
			}	
		}
		return index;
	}
}
