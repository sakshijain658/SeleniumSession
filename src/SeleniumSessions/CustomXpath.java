package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//absolute xpath should not be used,
		//1.perforamnce issue
		//2. can be changed anytym
		//3.not realible
		//
		
		
		
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("java");
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("java");
		driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("java");

		//input[contains(@id,'test@123_')]
		 // test@123_123
		//input[starts-with(@id,'test@123_')]
		//input[ends-with(@id,'test@123_')]
		
		//For links custom xpath
		driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();

	}

}
