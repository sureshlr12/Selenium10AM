import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Certificates {

	public static void main(String[] args) throws InterruptedException {
	    //ProfilesIni allProfile = new ProfilesIni();
	    
		FirefoxProfile fp = new FirefoxProfile();
		fp.setAcceptUntrustedCertificates(true);
		fp.setAssumeUntrustedCertificateIssuer(true);
		WebDriver driver = new FirefoxDriver(fp);
		driver.get("https://184.106.253.74");
		System.out.println("Title-->"+driver.getTitle());
		
		//IE:driver.navigate().to("javascript:document.getElementById('overridelink').click()")
		Thread.sleep(5000);
		driver.quit();
	}

}
