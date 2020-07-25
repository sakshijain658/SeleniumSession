package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//1. Launching  FF..Geckodriver
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		
		//2. Chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\Sakshi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		//to get titile of page
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook – log in or sign up")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		//to get currenturl
		System.out.println(driver.getCurrentUrl());
		
		//to get page source
		System.out.println(driver.getPageSource());
		
		//to quit browser
		driver.quit();
	}

}
