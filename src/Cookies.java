import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Cookies {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\qtt\\Desktop\\Hari_WeekendBatch\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);	
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		Set<Cookie>cookies = driver.manage().getCookies();
		System.out.println("Cookies size-->"+cookies.size());
		
		Iterator<Cookie> it = cookies.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		driver.close();
		
		
		

	}

}
