package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {

		  
		  Xls_Reader reader=new Xls_Reader("C:\\Users\\User\\eclipse-workspace\\SeleniumSession\\HalfEbayTestData.xlsx");
		  
		String firstName  = reader.getCellData("Sheet1", "firstname",2 );
		System.out.println(firstName);
		
		String LastName  = reader.getCellData("Sheet1", "lastname",2 );
		System.out.println(LastName );
		
		String Address1  = reader.getCellData("Sheet1", "address1",2 );
		System.out.println(Address1);
		
		String Address2  = reader.getCellData("Sheet1", "address2",2 );
		System.out.println(Address2);
		
		String City  = reader.getCellData("Sheet1", "city",2 );
		System.out.println(City);
		
		String State  = reader.getCellData("Sheet1", "state",2 );
		System.out.println(State);
		
		String Zipcode  = reader.getCellData("Sheet1", "zipcode",2 );
		System.out.println(Zipcode);
		
		String Email  = reader.getCellData("Sheet1", "emailaddress",2 );
		System.out.println(Email);
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&Usage=2943&ru=");
		  
		  
		  
			driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstName);
	
			driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(LastName);
			
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(Address1);
			
			driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(Address2);
			
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(City);
			
			Select select=new Select(driver.findElement(By.xpath("//select[@id='state']")));
			select.selectByVisibleText(State);
			driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(Zipcode);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
}
	
	
	
}
