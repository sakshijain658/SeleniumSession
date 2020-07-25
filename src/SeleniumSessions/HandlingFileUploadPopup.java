package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFileUploadPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\User\\Downloads\\Selenium.xlsx");
//type="file" should be there
	}

}
