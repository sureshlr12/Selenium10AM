import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;


public class Implicit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://yahoo.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.findElement(By.id("UHSearchBox")).sendKeys("Hello");
		String text= driver.findElement(By.xpath("//a[starts-with(normalize-space(),'hello b')]")).getText();
		System.out.println(text);
		driver.quit();
		

	}

}
