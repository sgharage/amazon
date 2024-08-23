package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazonLoginPage {
	@Test
	
	public static void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		System.out.println("enter in loop");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	}
}
