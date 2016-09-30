import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TimeCalculation {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https:google.com");
		
		long startTime = System.currentTimeMillis();
		driver.manage().window().maximize();
		System.out.println("Title-->"+driver.getTitle());
		driver.findElement(By.id("lst-ib")).sendKeys("selenium vacancies");
		driver.findElement(By.name("btnG")).click();
		long endTime = System.currentTimeMillis();	
		driver.close();
		
		long totalTime = endTime - startTime;
		System.out.println("Time taken for execution:"+totalTime+"milliSeconds");
		
	}

}
