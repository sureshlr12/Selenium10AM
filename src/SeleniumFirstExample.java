import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SeleniumFirstExample {

	public static void main(String[] args) throws InterruptedException {
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe"));
		FirefoxDriver driver =new FirefoxDriver(binary,null);		
		driver.get("http://google.com");
		driver.quit();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\qtt\\Desktop\\premchand_Weekend\\chromedriver_win32\\chromedriver.exe");
		//System.out.println(System.getProperty("user.dir"));
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("http://facebook.com");
		driver1.quit();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\qtt\\Desktop\\premchand_Weekend\\IEDriverServer_Win32_2.46.0\\IEDriverServer.exe");
		InternetExplorerDriver driver2 = new InternetExplorerDriver();
		driver2.get("http://gmail.com");
		driver2.quit();
	
		
		
		
	}

}
