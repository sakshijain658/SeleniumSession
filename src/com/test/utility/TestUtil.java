package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;




public class TestUtil {
	
	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {
		
		ArrayList<Object[]> myData=new ArrayList<Object[]>();
		try {
		reader =new Xls_Reader("C:\\Users\\User\\eclipse-workspace\\SeleniumSession\\HalfEbayTestData.xlsx");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int rowNum=2;rowNum<=reader.getRowCount("Sheet1");rowNum++) 
			{
				String firstname =reader.getCellData("Sheet1","firstname",rowNum);
				String lastname =reader.getCellData("Sheet1","lastname",rowNum);
				String address1	= reader.getCellData("Sheet1","address1",rowNum);
				String address2 =reader.getCellData("Sheet1","address2",rowNum);
				String city =reader.getCellData("Sheet1","city",rowNum);
				String state =reader.getCellData("Sheet1","state",rowNum);
				String zipcode =reader.getCellData("Sheet1","zipcode",rowNum);
				String emailaddress =reader.getCellData("Sheet1","emailaddress",rowNum);
				
				Object ob[]= {firstname,lastname,address1,address2,city,state,zipcode,emailaddress}	;
				
				myData.add(ob);
			}
			return myData;
		}
		
		
	}


