import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Profile {

	public static void main(String[] args) throws InterruptedException {
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile prof = profile.getProfile("Selenium_users");
		
		WebDriver driver = new FirefoxDriver(prof);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		Thread.sleep(7000);
		driver.quit();

	}

}
