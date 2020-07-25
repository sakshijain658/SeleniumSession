package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
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
	
	
	@Test(priority=2)
	public void goggleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=1,groups="Title")
	public void goggleLogoTest() {
	boolean b1=	driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
	}
	
	@Test(priority=3,groups="test")
	public void test1() {
		System.out.println("test");
	}
	
	@Test(priority=4,groups="test")
	public void test2() {
		System.out.println("test");
	}
	
	@Test(priority=5,groups="test")
	public void test3() {
		System.out.println("test");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
}
