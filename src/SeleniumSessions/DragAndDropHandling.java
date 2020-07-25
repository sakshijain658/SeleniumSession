package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		
		//driver.findElement(By.xpath("//div[@id='draggable']")).click();
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).
		moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).
		release().build().perform();
		
		
		

	}

}
