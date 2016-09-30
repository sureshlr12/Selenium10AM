import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\qtt\\Desktop\\Hari_WeekendBatch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement dest = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		//act.dragAndDrop(src, dest).perform();
		act.clickAndHold(src).moveToElement(dest).release(dest).perform();
		
		Thread.sleep(7000);
		System.out.println(driver.findElement(By.xpath("//*[@id='droppable']/p")).getText());
		driver.close();
	}

}
