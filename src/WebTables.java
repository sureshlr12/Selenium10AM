import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebTables {

	static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) {
		
		driver.get("http://money.rediff.com/gainers?src=top_nav");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("No of rows = "+rows.size());
		
		WebElement table = driver.findElement(By.xpath("//*[@id='leftcontainer']/table"));
		
		//No of rows
		/*List<WebElement> newRows = table.findElements(By.tagName("tr"));
		System.out.println("No of rows = "+newRows.size());*/

		
			
		//No of columns
		List<WebElement> columns = table.findElements(By.tagName("th"));
		System.out.println("No of colums = "+columns.size());
		
		
		/*List<WebElement> columns = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td"));
		System.out.println("No of columns = "+columns.size());*/
		
		for(int i=0;i<columns.size();i++){
			System.out.println(columns.get(i).getText());
		}
		
		
		List<WebElement> companyRows = table.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("Company rows = "+companyRows.size());
		
		
		List<WebElement> groupRows = table.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[2]"));
		System.out.println("groupRows rows = "+groupRows.size());
		
		for(int i=1;i<=companyRows.size();i++){
			if(i==11){
				break;
			}
			
			System.out.println(companyRows.get(i).getText()+ " -----"+groupRows.get(i).getText());
		}
		
		/*System.out.println("****************************");
		for(int i = 1;i<=rows.size();i++){
			if(i==11){
				break;
			}
			System.out.println(rows.get(i).getText());
			
		}
		
		driver.close();
	
*/
		driver.quit();
}
	
}
