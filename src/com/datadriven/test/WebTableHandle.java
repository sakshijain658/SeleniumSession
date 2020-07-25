package com.datadriven.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.excel.utility.Xls_Reader;

public class WebTableHandle {


	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		   driver.get("https://www.w3schools.com/html/html_tables.asp");
		   
		   String beforexpath_company="//table[@id='customers']/tbody/tr[";
		   String afterxpath_company="]/td[1]";
		 
		   String beforexpath_contact="//table[@id='customers']/tbody/tr[";
		   String afterxpath_contact="]/td[2]";
				   
				   
		List<WebElement> row=  driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
		System.out.println(row.size());
		
		Xls_Reader reader=new Xls_Reader("C:\\Users\\User\\eclipse-workspace\\SeleniumSession\\HalfEbayTestData.xlsx");
		
		if(!reader.isSheetExist("TableData1")) {
		reader.addSheet("TableData1");
		}
		reader.addColumn("TableData1", "companyName");
		reader.addColumn("TableData1", "contactName");
		
		
		
		for(int i=2;i<row.size();i++) {
		String actualpath_company=beforexpath_company+i+afterxpath_company;
		String companyName=driver.findElement(By.xpath(actualpath_company)).getText();
		System.out.println(companyName);
		reader.setCellData("TableData1", "companyName", i, companyName);
		
		String actualpath_contact=beforexpath_contact+i+afterxpath_contact;
		String contactName=driver.findElement(By.xpath(actualpath_contact)).getText();
		System.out.println(contactName);
		reader.setCellData("TableData1", "contactName", i, contactName);
		}
		 //td[contains(text(),'Alfreds Futterkiste')]
		 //td[contains(text(),'Centro comercial Moctezuma')]

	}

}
