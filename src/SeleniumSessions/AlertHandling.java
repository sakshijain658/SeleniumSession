package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();//this is JS popup basically
		System.out.println(alert.getText());
		
		if(alert.getText()=="Please enter a valid user name") {
			System.out.println("correct popup");
		}
		else {
			System.out.println("incorrect popup");
		}
alert.accept();//to click on ok button of alert
//alert.dismiss();//to click on dismiss button of alert
			
	}

}
