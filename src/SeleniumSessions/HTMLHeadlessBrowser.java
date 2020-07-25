package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HTMLHeadlessBrowser {

	public static void main(String[] args) throws InterruptedException {
		// it is used when we want to execute our script 10 times without opening browserso thatquickly ation is performed
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new HTMLUnitDriver();
		
		
		
		//HTMLUnitDriver is not vailable in selenium 3.x so we have to download jar
		//
		driver.get("https://ui.freecrm.com/");
		
		System.out.println("beforre login:"+ driver.getTitle());
		
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("sakshigoelss658@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		Thread.sleep(2000);
		System.out.println("after login:"+ driver.getTitle());
	}
	
	//1. fast as no browswr is launched
	//2 testingbehind the scene,we can do other work as well
	//3 not situable for Actions class,,,click mouse movements ,drag and drop
	//4. sometimes ,HTML DOM structure is changed,,,so in that case will not be useful
	//5 Ghost driver///// Headless Driver
	
	

}
