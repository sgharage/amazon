package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.BaseTest;

public class amazonLoginPage extends BaseTest {

	@Test
	public static void login() throws InterruptedException {
		System.out.println("enter in loop");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();

	}
}
