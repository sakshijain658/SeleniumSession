package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class ParameteriseTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&Usage=2943&ru=");
		  
		
		//Get data from excel
		Xls_Reader reader=new Xls_Reader("C:\\Users\\User\\eclipse-workspace\\SeleniumSession\\HalfEbayTestData.xlsx");
		int rowCount=reader.getRowCount("Sheet1");
		
		reader.addColumn("Sheet1", "Status");
		
		//Parametrisation or Data Driven Approach used to create DD framework
		//DD Approach/Parameterisation --driving the test data from excel files
		for(int rowNum=2;rowNum<=rowCount;rowNum++) {
			System.out.println("+++++++++");
			String firstName  = reader.getCellData("Sheet1", "firstname", rowNum);
			System.out.println(firstName);
			
			String LastName  = reader.getCellData("Sheet1", "lastname",rowNum );
			System.out.println(LastName );
			
			String Address1  = reader.getCellData("Sheet1", "address1",rowNum );
			System.out.println(Address1);
			
			String Address2  = reader.getCellData("Sheet1", "address2",rowNum );
			System.out.println(Address2);
			
			String City  = reader.getCellData("Sheet1", "city",rowNum );
			System.out.println(City);
			
			String State  = reader.getCellData("Sheet1", "state",rowNum );			System.out.println(State);
			
			String Zipcode  = reader.getCellData("Sheet1", "zipcode",rowNum );
			System.out.println(Zipcode);
			
			String Email  = reader.getCellData("Sheet1", "emailaddress",rowNum );
			System.out.println(Email);
			
			//Enter data
			driver.findElement(By.xpath("//input[@id='firstname']")).clear();
				driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstName);
				
				driver.findElement(By.xpath("//input[@id='lastname']")).clear();
				driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(LastName);
				
				driver.findElement(By.xpath("//input[@id='address1']")).clear();
				driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(Address1);
				
				driver.findElement(By.xpath("//input[@id='address2']")).clear();
				driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(Address2);
				
				driver.findElement(By.xpath("//input[@id='city']")).clear();
				driver.findElement(By.xpath("//input[@id='city']")).sendKeys(City);
				
				Select select=new Select(driver.findElement(By.xpath("//select[@id='state']")));
				select.selectByVisibleText(State);
				
				driver.findElement(By.xpath("//input[@id='zip']")).clear();
				driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(Zipcode);
				
				driver.findElement(By.xpath("//input[@id='email']")).clear();
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
				
				reader.setCellData("Sheet1", "Status", rowNum, "Pass");//write data into excel column
			
		}
		  
	
		

		
	}

}
