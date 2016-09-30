import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;


public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/html/default.asp");
		System.out.println("Title:"+driver.getTitle());
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[4]/div/div[2]/div[2]/div[1]/div/div[4]/a/img")));
		 
		 
		 FluentWait wait2 =  new FluentWait(driver)    
		    .withTimeout(30, TimeUnit.SECONDS)    
		    .pollingEvery(5, TimeUnit.SECONDS)   
		    .ignoring(NoSuchElementException.class);
		
		 wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[4]/div/div[2]/div[2]/div[1]/div/div[4]/a/img")));
		driver.close();
		

	}

}
