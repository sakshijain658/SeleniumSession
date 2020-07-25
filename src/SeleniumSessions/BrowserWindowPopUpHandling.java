package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserWindowPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
		
		//now there are 2 windows and getWindowHandles will return a set of objects which contain 2 window ids i.e. parent nd child window ids
		//in set objects values are not stored in form of index..0,1 so wehave to use iteartor
		//iterator is pointing on top of set objects in memory i.e. above the set objects
		//
		
		Set<String> handler=driver.getWindowHandles();// it will return window ids
		Iterator<String> itr=handler.iterator();
		String parentWindowId=itr.next();// it will give 1st value
		System.out.println( "parentWindowId is :" +parentWindowId); 
		
		String childWindowId=itr.next();
		System.out.println("childWindowId) is : "+ childWindowId);
		Thread.sleep(2000);
		driver.switchTo().window(childWindowId);
		System.out.println("childWindowIdpopup title is : "+ driver.getTitle());
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parentWindowIdpopup title is : "+ driver.getTitle());
		driver.quit();
		
	}
	

}
