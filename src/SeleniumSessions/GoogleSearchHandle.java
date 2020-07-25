package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
	List<WebElement> list=	driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']//span[contains(text(),'testing')]"));
		//ul[@role='listbox']//li/descendant::div[@class='sbl1']//span[contains(text(),'testing')]
	
	System.out.println("total no of suggestions :"+list.size());
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		if(list.get(i).equals("testing coronavirus near me")) {
			list.get(i).click();
			break;
		}
		
	}
	}

}
