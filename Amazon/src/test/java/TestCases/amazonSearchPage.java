package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class amazonSearchPage extends amazonLoginPage {

	@Test
	public void verifyHomePage() {
		System.out.println("Page Url is: " + driver.getCurrentUrl());
		System.out.println("Page Title is: " + driver.getTitle());
	}

	@Test
	public void verifyAmazonSearch() throws InterruptedException {
		
		driver.findElement(By.id(Loc.getProperty("search_box"))).sendKeys("Watch");
		Thread.sleep(2000);
	}
}
