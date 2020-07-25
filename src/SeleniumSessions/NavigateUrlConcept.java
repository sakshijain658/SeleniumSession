package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateUrlConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.gmail.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.get() and driver.navigate().to() both are used to launch url but navigate to is used to launch externalurl
		
	}

}
