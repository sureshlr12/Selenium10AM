import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Windows {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		String parentId = driver.getWindowHandle();
		System.out.println("Parent Id:"+parentId);
		
		driver.findElement(By.xpath("//*[@id='TosLink']")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println("Number of Windows:"+windowIds.size());
		
		System.out.println("************************");
		
		Iterator<String> it =  windowIds.iterator();
		
		while(it.hasNext()){
			String chaildWindow = it.next();
			
			System.out.println("Chaild windows:"+chaildWindow);
			
			if(!parentId.equalsIgnoreCase(chaildWindow)){
				driver.switchTo().window(chaildWindow);
				System.out.println("Chaild window Title:"+driver.getTitle());
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id='maia-main']/div[2]/p[1]/a")).click();
				driver.close();
			}
		}
		
		driver.switchTo().window(parentId);
		driver.close();
		
		driver.quit();
		
	}

}
