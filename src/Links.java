import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Links {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of Links-->"+links.size());
		
		for(int i=0;i<links.size();i++){
			if(links.get(i).getText().isEmpty())
				continue;
			System.out.println(links.get(i).getText());
		}
		
		
		
		driver.quit();

	}

}
