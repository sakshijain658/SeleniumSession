package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropFileRead {

	public static void main(String[] args) throws IOException {
		//need to create object of properties class nad FileInputStream class
		Properties prop=new Properties();
		FileInputStream is=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumSession\\src\\SeleniumSessions\\config.properties");
		prop.load(is);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("URL")); //will give null
	String url=	prop.getProperty("URL");
	System.out.println(url);
	
	
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);
	
	if(browserName.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
	}
	
	}
	

}
