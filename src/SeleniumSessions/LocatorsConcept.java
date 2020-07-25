package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsConcept {

	public static void main(String[] args) {
		//in selenium everything is known as web element,
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
//Xpath, ID, Name, CssSelector, ClassName, LinkText, PartialLinkText

		
		
		//1. xpath---priority--2
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Sakshi");
		//2. id ...priority--1
		//driver.findElement(By.id("lastname")).sendKeys("Goel");
		
		//3. name...priority--3
		//driver.findElement(By.name("email")).sendKeys("sakshigoel@gmail.com");
		
		//4, LinkText---priority--(1 for links)
		//driver.findElement(By.linkText("User Agreement")).click();
		
		//5. PartialLinkText--not recommended
		//driver.findElement(By.partialLinkText("User Privacy")).click();
		
		//6 CSSSelector9 priority--2)
		//driver.findElement(By.cssSelector("#PASSWORD")).sendKeys("tester");// #idvalue i.e. #PASSWORD
																		// .classname i.e. #PASSWORD
		
		//driver.findElement(By.cssSelector(".re-w3 wide  wide fld regular-text bold-text float-box")).sendKeys("tester");
		
		//7 className
		//driver.findElement(By.className("fld wide wide fld regular-text bold-text float-box")).sendKeys("Sakshi");
		
	}

}
