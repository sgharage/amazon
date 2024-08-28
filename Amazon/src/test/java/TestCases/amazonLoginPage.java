package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.BaseTest;

public class amazonLoginPage extends BaseTest {

	@Test(priority = 1)
	public static void Invalid_user_name() throws InterruptedException {
		System.out.println("enter in loop");
		driver.findElement(By.id(Loc.getProperty("sign_in"))).click();
		driver.findElement(By.xpath(Loc.getProperty("login"))).sendKeys("abc@12");
		Thread.sleep(1000);
		driver.findElement(By.id(Loc.getProperty("Click_Continue"))).click();
	}

	@Test(priority = 2)

	public static void Invalid_Password() throws InterruptedException {
		System.out.println("enter in loop1");

		driver.findElement(By.id(Loc.getProperty("sign_in"))).click();
		driver.findElement(By.xpath(Loc.getProperty("login"))).sendKeys("sarikagharage8@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id(Loc.getProperty("Click_Continue"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(Loc.getProperty("login_password"))).sendKeys("123@asd");

		System.out.println("Password entered");
//		//Window Handling
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(2000);
		driver.findElement(By.id(Loc.getProperty("Sign_in"))).click();

		// Alert open
		try {
			Alert al = driver.switchTo().alert();
			String alertText = al.getText();
			System.out.println("Alert text is " + alertText);
			al.accept();

		} catch (Exception e) {
			System.out.println("unexpected alert not present");
		}

	}
	@Test(priority = 3)
	public static void Valid_loginData() throws InterruptedException {
		System.out.println("enter in loop");
		driver.findElement(By.id(Loc.getProperty("sign_in"))).click();
		driver.findElement(By.xpath(Loc.getProperty("login"))).sendKeys("sarikagharage8@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id(Loc.getProperty("Click_Continue"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(Loc.getProperty("login_password"))).sendKeys("Sarika@1205");
		driver.findElement(By.id(Loc.getProperty("Sign_in"))).click();
		Thread.sleep(3000);
	}

}
