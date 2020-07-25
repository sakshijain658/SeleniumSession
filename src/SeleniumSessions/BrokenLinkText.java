package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinkText {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://ui.freecrm.com/");
		  
		  
		  driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("sakshigoelss658@gmail.com");
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@123");
		  driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		  Thread.sleep(2000);

		  //for links --a href <https://www.google.com>
		  //for images --img href<https://www.test.com>
		  
		  //1. get list of all link and images,
		List<WebElement> linkList=  driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("full linklist size is :"+linkList.size() );
		
		//.some of links may dont have href propertis defined for them
		List<WebElement> activeLinks=new ArrayList<WebElement>();
		
		//2. Iterate linklist
		for(int i=0;i<linkList.size();i++) {
			if(linkList.get(i).getAttribute("href")!=null&& (!linkList.get(i).getAttribute("href").contains("javascript"))){
				activeLinks.add(linkList.get(i));
			}
		}
		//get sizeof activeLink List size.
		System.out.println("activelink list size is :"+activeLinks.size() );
		
		//3 checking 	href url with httpconnection api
		for(int j=0;j<activeLinks.size();j++) {
			HttpURLConnection connection=(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response=connection.getResponseMessage();//ok
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"-----"+response);
		}
		
		
	}

}
