package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		clickOn(driver, driver.findElement(By.xpath("//input[@id='u_0_b']")), 20);
		//explicit wait is for specific element not for all elements.

	}
	
	public  static void clickOn(WebDriver driver,WebElement element,int timeout) {
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
