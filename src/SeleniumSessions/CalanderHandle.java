package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalanderHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");  
		WebElement date=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dateVal="14-07-2020";
		
		selectDateByJS(driver,date,dateVal);
	}
	public static void selectDateByJS(WebDriver driver,WebElement element,String dateVal) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
	}

}
