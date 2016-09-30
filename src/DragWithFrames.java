import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class DragWithFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\qtt\\Desktop\\Hari_WeekendBatch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
		driver.get("http://jqueryui.com/droppable/");	
		driver.switchTo().frame(0);
		
		WebElement  element = driver.findElement(By.id("draggable"));
		
		Actions builder = new Actions(driver);
		//builder.dragAndDropBy(element, 100, 20).perform();
		builder.clickAndHold(element).moveToElement(element, 100,20).perform();
		Thread.sleep(10000);
		
				
		driver.close();
		

	}

}
