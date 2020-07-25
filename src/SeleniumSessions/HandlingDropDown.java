package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Select select=new Select(driver.findElement(By.id("day")));
		//select.selectByValue("2");
		select.selectByVisibleText("4");
		
		
		//radio buttons
		//u_0_6
		driver.findElement(By.id("u_0_6")).click();
		
	}

}
