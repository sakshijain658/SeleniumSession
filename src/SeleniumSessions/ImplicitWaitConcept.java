package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//implicitwait and pageLoadTimeout both are dynamic wait nad global wait while thread.sleep() is static
		//implicitlyWait is for all elements for a webpage..page is fully loaded but some elements are not availble
		//if task is done in 20 sec and 10/20 sec will be ignored.
		//thread.sleep will make script slow,,is will wait for 30 sec.
		
		
	}

}
