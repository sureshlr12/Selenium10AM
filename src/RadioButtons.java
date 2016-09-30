import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RadioButtons {

	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		System.out.println("Title-->"+driver.getTitle());
		
		WebElement box = driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radiobuttons = box.findElements(By.name("group1"));
		System.out.println("Number of radio buttons:"+radiobuttons.size());
		
		for(int i=0;i<radiobuttons.size();i++){
			if(radiobuttons.get(i).isSelected())
			System.out.println(radiobuttons.get(i).getAttribute("value"));
			
		}		
		driver.close();
	}
}
