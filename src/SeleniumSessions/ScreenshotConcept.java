package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotConcept {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//take screenshot and save it as file format
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,new File("C:\\Users\\User\\Desktop\\google.png"));
		// Now you can do whatever you need to do with it, for example copy somewhere
		//FileUtils.copyFile(scrFile, new File("C:\\Users\\User\\Desktop\\SakshiGoel"));
	}

}
