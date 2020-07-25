package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeadlessChromeTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//chrome version should be grater than 60
		// windows size-1400,800
		ChromeOptions  options=new ChromeOptions();
		options.addArguments("window-size-1400,800");
		options.addArguments("headless");
		  WebDriver driver=new ChromeDriver(options);
		  driver.get("https://ui.freecrm.com/");
		  System.out.println("title before login:-" +driver.getTitle());
		  
		  driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("sakshigoelss658@gmail.com");
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@123");
		  driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		  Thread.sleep(2000);
		  System.out.println("title after login:-" +driver.getTitle());

	}

}
