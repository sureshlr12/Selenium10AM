import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;


public class MyListener extends AbstractWebDriverEventListener {
	
	public  void beforeNavigateBack(WebDriver driver){
		System.out.println(("Before going to Navigate functioon"));
	}
	
	

}
