import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class WithoutChangeCode {
	
	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {

		String browserType="Chrome";
	
		if(browserType.equals("Firefox")){
			 driver=new FirefoxDriver();
			
		}else if(browserType.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\qtt\\Desktop\\Hari_WeekendBatch\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}else if(browserType.equals("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\qtt\\Desktop\\Hari_WeekendBatch\\IEDriverServer_Win32_2.45.0\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		
		driver.get("http://Linkedin.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		
	}

}
