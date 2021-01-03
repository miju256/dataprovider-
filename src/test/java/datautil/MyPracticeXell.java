package datautil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class MyPracticeXell {
	
		public void readxFile() {
		try {
			FileInputStream file = new FileInputStream("/Users/mdgulamkibria/Desktop/bit tech/dataprovider/excel/ExcelFile.xlsx");
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet  sheet =workbook.getSheet("Sheet1");
			
			int rowNum =sheet.getLastRowNum();
			int colNum =sheet.getRow(0).getLastCellNum();
			
			for (int i = 1; i <=rowNum; i ++ ) {
				XSSFRow row=sheet.getRow(i);
				System.out.println(row);
				for(int j =0 ;j<colNum; j++) {
					XSSFCell  cell=row.getCell(j);
					switch(cell.getCellType()) {
					case STRING :System.out.println(cell.getStringCellValue());break;
					case NUMERIC:System.out.println(cell.getNumericCellValue());break;
					case BOOLEAN:System.out.println(cell.getBooleanCellValue());break;
					default:
						break;
					}
					//System.out.println(cell);
				}
				System.out.println();
				}
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
		}
		
		
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
