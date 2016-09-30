import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailOperations {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		//maximizing the screen
		driver.manage().window().maximize();
		
		/*WebElement user_name = driver.findElement(By.id("Email"));
		user_name.sendKeys("qt.selenium");
		
		WebElement nextButton = driver.findElement(By.name("signIn"));
		nextButton.click();
		Thread.sleep(7000);
		
		WebElement password = driver.findElement(By.xpath("//*[@id='Passwd']"));
		password.sendKeys("qt123456");
		
		WebElement signInButton = driver.findElement(By.xpath("//*[@id='signIn']"));
		signInButton.click();
		*/
		driver.findElement(By.id("Email")).sendKeys("qt.selenium");
		driver.findElement(By.name("signIn")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("qt123456");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		Thread.sleep(7000);
		
		
		
		driver.quit();

	}

}
