package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementVivibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://ui.freecrm.com/");
		  
		  
//		  driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("sakshigoelss658@gmail.com");
//		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@123");
//		  driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
//		  Thread.sleep(2000);
		  
		  
		  //1.isDisplayed :forall elements
		 boolean b1= driver.findElement(By.xpath("//div[contains(text(),'Login')]")).isDisplayed();
		 System.out.println(b1); 
		 
		 //2. isEnabled: elemnt is available on page butwith enabld and disabled property
		 //sometimes we have toclick on checkbox then particular button isenabled.
		 //In that case firstly ..isEnabled() will return false and afetr clicking checkbox it will return true
		 
		boolean b2= driver.findElement(By.xpath("//div[contains(text(),'Login')]")).isEnabled();
		 System.out.println(b2); 
		 
		 
		 //3 isSelected : only for checkbox,dropdown and radio btns
		 //if chkbox,dropdown ,radio btn are chcked then will return true otherwise false
		 
		 boolean b3 =driver.findElement(By.xpath("abc")).isSelected();
		 System.out.println(b3); 
		 
		 
	}

}
