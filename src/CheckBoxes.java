import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		System.out.println("Title-->"+driver.getTitle());
		
		WebElement box = driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table"));
		List<WebElement> checboxes= box.findElements(By.tagName("input"));
		System.out.println("Number of checkBoxes:"+checboxes.size());
		
		for(int i=0;i<checboxes.size();i++){
		
			if(checboxes.get(i).isSelected()){
				System.out.print("Selected checkBox:");
				System.out.println(checboxes.get(i).getAttribute("value"));
				checboxes.get(i).click();
			}else{
				System.out.println("uncheck CheckBoxes:");
				System.out.println(checboxes.get(i).getAttribute("value"));
				checboxes.get(i).click();
			}
		}
		
		Thread.sleep(7000);
		driver.close();
		
	}

}
