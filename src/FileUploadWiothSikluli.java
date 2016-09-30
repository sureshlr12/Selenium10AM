import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class FileUploadWiothSikluli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		Screen  scr = new Screen();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://tinypic.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//*[@id='the_file']")).sendKeys("C:\\Users\\qtt\\Desktop\\ExcersizeLinks.txt");
		
		Pattern browse = new Pattern("C:\\Users\\qtt\\Desktop\\premchand_Weekend\\sikuli\\browse.jpg");
		Pattern textbox = new Pattern("C:\\Users\\qtt\\Desktop\\premchand_Weekend\\sikuli\\textBox.jpg");
		Pattern open = new Pattern("C:\\Users\\qtt\\Desktop\\premchand_Weekend\\sikuli\\open.jpg");
		
		scr.click(browse);
		scr.type(textbox, "C:\\Users\\qtt\\Desktop\\ExcersizeLinks.txt");
		scr.click(open);
	
		Thread.sleep(7000);
		driver.quit();
	}

}
