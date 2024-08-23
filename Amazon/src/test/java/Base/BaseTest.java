package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	public static Properties Loc = new Properties();
	
	
	@BeforeTest
	public void setup() throws IOException {
		if (driver == null) {
			// check the location of the file)
			System.out.println("The Path is: " + System.getProperty("user.dir"));
			FileReader fr = new FileReader(
					System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\Config.properties");
		//	FileReader fr = new FileReader ("D:\\Sarika\\selenium project\\Amazon_TestAutomation\\Amazon\\src\\test\\resources\\ConfigFiles\\config.properties");
			prop.load(fr);
		}
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		//	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));// config properties
		} else if (prop.getProperty("browser").equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();// base
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));// config properties
		}
	}
/*
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Teardown Sucessfully");
	}
*/
}
