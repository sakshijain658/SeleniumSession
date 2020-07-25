package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	WebDriver driver;
	
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		   driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   driver.get("https://www.google.com/");
		   
	}
	
	
	@Test
	public void goggleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google1","title is not matched");
	}
	@Test
	public void goggleLogoTest() {
		boolean b1=	driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b1);
		Assert.assertEquals(b1, true);
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}
