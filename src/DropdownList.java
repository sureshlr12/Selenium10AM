import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


//Site:https://events.developerforce.com/signup

public class DropdownList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://events.developerforce.com/signup");
		driver.manage().window().maximize();
		System.out.println("Title-->"+driver.getTitle());
		
		WebElement listBox = driver.findElement(By.xpath("//*[@id='country']"));
		List<WebElement> options = listBox.findElements(By.tagName("option"));
		System.out.println("Number of Options:"+options.size());
		for(int i=0;i<options.size();i++){
			System.out.println(options.get(i).getText());
		}
		
		
		System.out.println(("======================================"));
		Select select = new Select(listBox);
		/*System.out.println(select.getFirstSelectedOption().getText());
		select.selectByIndex(2);
		Thread.sleep(5000);
		select.selectByValue("AW");
		Thread.sleep(5000);
		select.selectByVisibleText("Argentina");
		Thread.sleep(5000);
		
		if(select.isMultiple()){
			System.out.println("It is Multi value list box");
		}else{
			System.out.println("It is Single value list box");
		}
		
	*/	
		Random r= new Random();
		select.selectByIndex(r.nextInt(options.size()));
	
	
		driver.quit();

	}

}
