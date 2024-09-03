package TestCases;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class amazonHomePage extends amazonLoginPage {
	@Test
	public void verifyHomePage() {
		System.out.println("Page Url is: " + driver.getCurrentUrl());
		System.out.println("Page Title is: " + driver.getTitle());
	}

	@Test
	public void verifyDeliveryAddress() throws InterruptedException {

		// Handle Parent window
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent Window: " + parentWindowHandle);

		// Click on delivery adderss menu
		WebElement deli_add = driver.findElement(By.id(Loc.getProperty("delivery_add")));
		deli_add.click();
		
		Thread.sleep(2000);
		// Handle all open window
		Set<String> allOpenWindows = driver.getWindowHandles();
		System.out.println("All open window ID: " + allOpenWindows);
		/*
		 * for (String handle : allOpenWindows) { System.out.println(handle);
		 * 
		 * // check new open window is not equal to parent window if
		 * (!handle.equals(parentWindowHandle)) { driver.switchTo().window(handle);
		 * 
		 * WebElement done_btn =
		 * driver.findElement(By.xpath(Loc.getProperty("btn_Done"))); done_btn.click();
		 * Thread.sleep(2000); }
		 * 
		 * } driver.switchTo().window(parentWindowHandle);
		 */

//		driver.switchTo().frame("ape_Gateway_desktop-ad-center-1_desktop_iframe");
//		
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("window.scrollBy(0,1000)");

		// javascriptExecutor js = (javascriptExecutor) driver;

//  		WebElement done_btn = driver.findElement(By.xpath(Loc.getProperty("btn_Done")));
//  		done_btn.click();
//  		

	}

}
