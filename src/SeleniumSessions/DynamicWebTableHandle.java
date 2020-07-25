package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://ui.freecrm.com/");
		  
		  
		  driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("sakshigoelss658@gmail.com");
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@123");
		  driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		  
		//tr[1]//td[1]//div[1]//input[1]
		//tr[2]//td[1]//div[1]//input[1]
		//tr[3]//td[1]//div[1]//input[1]
		  
		  //Method 1
		  
//		  String before_xpath="//tr[";
//		  String after_xpath="]//td[1]//div[1]//input[1]";
//				  
//				for(int i=1;i<=3;i++) {
//				String name=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
//				System.out.println(name);
//				
//				if (name.contains("test2 test2"))
//				{
//					driver.findElement(By.xpath("//tr["+i+ "]//td[1]//div[1]//input[1]")).click();
//				}
//				  }
				  
				//Method2
				//td[contains(text(),'test test')]/preceding-sibling::td//div//input[@name="id"]
		  driver.findElement(By.xpath("//td[contains(text(),'test test')]/preceding-sibling::td//div//input[@name=\"id\"]")).click();
//a[contains(text(),'test2 test2')]/parent::td//preceding-sibling::td//input[@name='contact_id']
	}

}
