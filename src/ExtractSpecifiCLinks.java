import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ExtractSpecifiCLinks {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		WebElement subPortion=driver.findElement(By.xpath("//*[@id='_eEe']"));
		List<WebElement> links = subPortion.findElements(By.tagName("a"));
		System.out.println("Total number of links-->"+links.size());
		
		
		for(int i=0;i<links.size();i++)
			System.out.println(links.get(i).getText());
		
		driver.quit();
	}
	
}
