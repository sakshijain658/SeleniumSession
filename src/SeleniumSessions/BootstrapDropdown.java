package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\Sakshi\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
	List<WebElement> list=	driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li//a//label"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		list.get(i).click();
		
//			if(list.get(i).getText().equals("Angular")) {
//				list.get(i).click();
//				break;
//				
//			}
		}
		

	}

}
