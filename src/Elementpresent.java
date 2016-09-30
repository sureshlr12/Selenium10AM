import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.WebClient;


public class Elementpresent {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		int linkSize = driver.findElements(By.linkText("తెలుగు")).size();
		if(linkSize > 0){
			System.out.println("Element is present");
		}else{
			System.out.println("Element is not present");
		}
		
		driver.quit();

	}

}
