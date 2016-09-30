import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailLoginWithFunctions {

	public static WebDriver driver = new FirefoxDriver();
	public static GmailLoginWithFunctions gmail;
	public static void main(String[] args) throws InterruptedException {
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		doLogin(); //calling a method
		

	}
	
	public static void doLogin() throws InterruptedException{  // called method
		driver.findElement(By.id("Email")).sendKeys("qt.selenium");
		driver.findElement(By.name("signIn")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("qt123456");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		Thread.sleep(7000);
		doLogout();

	}
	
	public  static void doLogout() throws InterruptedException{
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[text()=\"qtselenium@gmail.com\"]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id='gb_71']")).click();
		Thread.sleep(7000);
		closeSession();
		doLogin();
	}
	
	public static void closeSession(){
		driver.quit();
	}

}
