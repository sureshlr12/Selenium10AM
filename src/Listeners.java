import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class Listeners {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\qtt\\Desktop\\Hari_WeekendBatch\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		MyListener listener = new MyListener();
		driver.register(listener);
		
		driver.navigate().to("http://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create account")).click();
		driver.navigate().back();
		Thread.sleep(7000);
		driver.close();
		

	}

	
}
