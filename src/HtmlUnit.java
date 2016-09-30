import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HtmlUnit {

	public static void main(String[] args) {
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		System.out.println("Title-->"+driver.getTitle());
		
		driver.quit();

	}

}
