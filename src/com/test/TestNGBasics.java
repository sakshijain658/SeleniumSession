package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	/*
	 * setup system properly for chrome
Launch Browser
enterURL
login
googleTitleTest
logout
closeBrowser
deleteAllCookies
	 */
	//Preconditions annotations: starting with @Before
	
	@BeforeSuite  //1
	public void setUp() {
		System.out.println("setup system properly for chrome");
	}

	@BeforeTest   //2
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@BeforeClass  //3
	public void enterURL() {
		System.out.println("enterURL");
	}
	
	@BeforeMethod //4
	public void login() {
		System.out.println("login");
	}
	
	//test cases ---starting with @Test
	
	@Test  //5
	public void googleTitleTest() {
		System.out.println("googleTitleTest");
	}
	
	@Test 
	public void searchTest() {
		System.out.println("searchTest");
	}
	
	@Test 
	public void goggleLogoTest() {
		System.out.println("goggleLogoTest");
	}
	
	
	//post conditions---starting with @After
	
	@AfterMethod   //6
	public void logout() {
		System.out.println("logout");
	}
	
	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("closeBrowser");
	}
	@AfterTest  //8
	public void deleteAllCookies() {
		System.out.println("deleteAllCookies");
	}
	
	
	
	
	@AfterSuite //9
	public void generateTestReport() {
		System.out.println("generateTestReport");
	}
	
	
	
	
	
	
}
