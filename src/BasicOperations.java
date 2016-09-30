import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasicOperations {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		//maximizing the screen
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title-->"+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(("Current URL"+currentUrl));
		
		System.out.println(("============================="));
		String pageSource =  driver.getPageSource();
		System.out.println("Page Source:"+pageSource);
		
		driver.quit();
		

	}

}
