package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.linkText("International Connection Baggage"))).build().perform();
		//driver.findElement(By.linkText("International Connection Baggage")).click();
		driver.findElement(By.linkText("Visa Services")).click();
	}

}
