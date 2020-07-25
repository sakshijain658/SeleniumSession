package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.name("email")).sendKeys("sakshigoelss658@gmail.com");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		driver.switchTo().frame("downloadFrame");
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	}

}
