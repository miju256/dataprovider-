package datautil;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDriven {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	public DataDriven(String xcelPath, String sheetName){
		try {
		workbook = new XSSFWorkbook(xcelPath);
		 sheet =workbook.getSheet(sheetName);
		 }catch(Exception e ){
			 e.printStackTrace();
		 }
		
	}
	public static  void getRowCount() {
		XSSFWorkbook workbook;
		try {
			
			int rowCount =sheet.getPhysicalNumberOfRows();
			System.out.println("num of romws "+rowCount );
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	@Test
	public static void getCellDataString (int rowNum , int colNUm) {
		try {
			
			String cellData= sheet.getRow(rowNum ).getCell(colNUm).getStringCellValue();
			
			
			System.out.println("my cell data is " + cellData);
			
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 
	}
	public static void getCellDataNum (int rowNum,int colNum) {
		try {
			
			double cellData= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			
			
			System.out.println("my cell data is " + cellData);
			
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		 
	}
	
	

}
