import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Title:"+driver.getTitle());
		
	    driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("");
	    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("");
	    driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
	    
	    Thread.sleep(5000);
		
		Alert aleret = driver.switchTo().alert();
		//for clicking Ok button
		aleret.accept();
		//cancel button on alert :alert.dismiss();
	    driver.close();
		

	}

}
