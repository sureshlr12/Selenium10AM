import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseActions {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.americangolf.co.uk/homepage");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement golfMenu = driver.findElement(By.xpath("//*[@id='navigation']/nav/ul/li[1]/a"));
		
		Actions build = new Actions(driver);
		build.moveToElement(golfMenu).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
