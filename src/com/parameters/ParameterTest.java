package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
 WebDriver driver;
 
 
@Test
@Parameters({"browser","url","emailid","password"})

public void crmLoginTest(String browser,String url,String emailid,String password) {
	
	if(browser.equals("firefox")) {
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	 driver=new FirefoxDriver();
	}
	  driver.get(url);
	  
	  driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).clear();
	  driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(emailid);
	  
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	  
	  driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	 //we can pass parameter through testNG.xml file 
}
 
}
