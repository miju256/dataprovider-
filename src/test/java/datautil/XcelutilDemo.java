package datautil;

public class XcelutilDemo {
	public static void main(String[]args) {
//	String projectPath ="/Users/mdgulamkibria/Desktop/"
//			+ "bit tech/dataprovider/excel/ExcelFile.xlsx";
	DataDriven data = new DataDriven("/Users/mdgulamkibria/Desktop/"
			+ "bit tech/dataprovider/excel/ExcelFile.xlsx", "Sheet1");
	DataDriven.getCellDataString(1, 1);
	//DataDriven.getCellDataNum(2, 3);
	}


}
