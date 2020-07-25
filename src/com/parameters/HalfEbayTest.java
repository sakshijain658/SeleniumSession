package com.parameters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class HalfEbayTest {
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		   driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&Usage=2943&ru=");
		   
	}
	@DataProvider//every data provider is associated with a method
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData=TestUtil.getDataFromExcel();
		return testData.iterator();
		 
	}
	
	@Test(dataProvider = "getTestData")//dataProvider = "getTestData" will provide connection between @DataProvider and @Test
	public void halfEbayRegister(String firstname,String lastname,String address1,String address2,
									String city,String state,String zipcode,String emailaddress) {
		
		//enter data
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//input[@id='lastname']")).clear();
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//input[@id='address1']")).clear();
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(address1);
		
		driver.findElement(By.xpath("//input[@id='address2']")).clear();
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(address2);
		

		driver.findElement(By.xpath("//input[@id='city']")).clear();
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
		
		Select select=new Select(driver.findElement(By.xpath("//select[@id='state']")));
		select.selectByVisibleText(state);
		
		driver.findElement(By.xpath("//input[@id='zip']")).clear();
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(zipcode);
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailaddress);
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
}
