package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		Xls_Reader reader=new Xls_Reader("C:\\Users\\User\\eclipse-workspace\\SeleniumSession\\HalfEbayTestData.xlsx");
		int rowCount=reader.getRowCount("Sheet1");
		
		if(!reader.isSheetExist("HomePAge")) {
		reader.addSheet("HomePAge");
		}
		
		int colCount=reader.getColumnCount("Sheet1");
		System.out.println("total col is "+ colCount);
		
		
		System.out.println(reader.getCellRowNum("Sheet1", "lastname", "jain"));
	}

}
