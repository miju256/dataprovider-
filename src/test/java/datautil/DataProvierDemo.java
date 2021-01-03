package datautil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvierDemo {
	Object[][] o;

	public Object[][] readXlData() throws IOException {
		try {
			FileInputStream file = new FileInputStream(
					"/Users/mdgulamkibria/" + "Desktop/bit tech/dataprovider/excel/ExcelFile.xlsx");
			XSSFWorkbook workBook = new XSSFWorkbook(file);
			XSSFSheet sheet = workBook.getSheetAt(0);
			
			// int rowCount =sheet.getLastRowNum();
			// sheet.getLastRowNum(0).
			o = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for (int i = 0; i <= sheet.getLastRowNum(); i++) {
				for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
					XSSFCell cell = sheet.getRow(i).getCell(j);
					if (cell.getCellType() == CellType.STRING) {
						o[i - 1][j] = cell.getStringCellValue();
					} else if (cell.getCellType() == CellType.NUMERIC) {
						o[i - 1][j] = cell.getNumericCellValue();
					}
				}
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return o;

	}
	
	
	public void getData() {
		
	}
		
	
		
	
	}


