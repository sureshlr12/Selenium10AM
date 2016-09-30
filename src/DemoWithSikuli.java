import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;


public class DemoWithSikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
	 Screen scr = new Screen();
	
	 
	 WebDriver driver = new FirefoxDriver();
	 driver.get("http://google.com");
	 driver.manage().window().maximize();
	 
	 Pattern gmailLink = new Pattern("C:\\Users\\qtt\\Desktop\\premchand_Weekend\\sikuli\\gmailLink.png");	
	 Pattern userName = new Pattern("C:\\Users\\qtt\\Desktop\\premchand_Weekend\\sikuli\\gmailUserName.png");
	 Pattern next = new Pattern("C:\\Users\\qtt\\Desktop\\premchand_Weekend\\sikuli\\next.png");
	 Pattern password = new Pattern("C:\\Users\\qtt\\Desktop\\premchand_Weekend\\sikuli\\gmailPassword.png");
	 Pattern signIn = new Pattern("C:\\Users\\qtt\\Desktop\\premchand_Weekend\\sikuli\\signIn.png");
	 
	 scr.click(gmailLink);
	 Thread.sleep(7000);
	 scr.type(userName, "qt.selenium");
	 scr.click(next);
	 scr.type(password, "qt123456");
	 scr.click(signIn);
	 
	 Thread.sleep(7000);
	 
	 driver.quit(); 

	}

}
