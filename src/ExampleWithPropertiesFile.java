import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ExampleWithPropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties config = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\qtt\\Desktop\\premchand_Weekend\\Tutorial 2\\src\\config\\config.properties");
		config.load(fis);
		
		System.out.println(config.getProperty("testUrl"));
		System.out.println(config.getProperty("testBrowser"));

	}

}
