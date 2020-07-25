package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//	import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JavascriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://ui.freecrm.com/");
		
		
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("sakshigoelss658@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@123");
		//driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		//Thread.sleep(2000);
		
		WebElement loginBtn=driver.findElement(By.xpath("//div[contains(text(),'Login')]")); //login btn
		//flash(loginBtn,driver);
	//	drawBorder(loginBtn,driver);
		
//		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(scrFile,new File("C:\\Users\\User\\eclipse-workspace\\SeleniumSession\\src\\SeleniumSessions\\bug.png"));
		
		//generate alert in runtime
		
		//generateAlert(driver,"There is an issue with login page");
		
		//click on any element using JS executor
		clickElementByJS(loginBtn,driver);
		
		//refresh the page
		//1. by using selenium 
		//driver.navigate().refresh();
		
		//2. by using JS
		refreshBrowserByJS(driver);
		
		
		//get title by js
		//1. by using selenium 
		//driver.getTitle();
		
		//2. by using JS
		System.out.println(getTitleByJS(driver));
		
		
		//get pagetext
		
	System.out.println(getPageInnerText(driver));
	
	
		//scrolling page down
	//pageScrollDown(driver);
	
 WebElement frgtPswdLink=driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
	
	scrollIntoView(frgtPswdLink,driver);

	}
	
	
	//JavascriptExecutor is a class and we have to pass  our driver into it.
	//after that js is typecasting
	//executeScript is used to execute JS concept.
	
	
	public static void flash(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i=0;i<25;i++) {
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);
			
		}
		
		}
		public static void changeColor(String color,WebElement element,WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
			
		}
		
		
		public static void drawBorder(WebElement element,WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.border='3px solid red'", element);
		}
		
		
		
		public static void generateAlert(WebDriver driver,String message) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("alert('"+message+"')");
		}
		
		public static void clickElementByJS(WebElement element,WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();",element);
		}
		
		
		public static void refreshBrowserByJS(WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("history.go(0)");
	}
		
		public static String getTitleByJS(WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
		String title=	js.executeScript("return document.title;").toString();
			return title;
	}
		
		
		public static String getPageInnerText(WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			String pageText= js.executeScript("return document.documentElement.innerText;").toString();
			return pageText;
			
		}
		
		public static void pageScrollDown(WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
		}
		
		
		public static void scrollIntoView(WebElement element,WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			 js.executeScript("arguments[0].scrollIntoView(true);",element);
			
		}
		
}


