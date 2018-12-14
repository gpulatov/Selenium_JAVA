package com.prestashop.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrestaShopPositiveTests {

	WebDriver driver;

	@BeforeTest
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
	}

	@AfterTest
	public void closeUp() {
		driver.quit();
	}

	@Test
	public void wrongCredentials() {

		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		String userEmail = "ggg4@gmail.com";
		String password = "aaa123";
		String fName = "Alex";
		String lName = "Paul";
		String company = "ABC Logistics";
		String address = "1501 Holleman Dr";
		String city = "Houston";
		driver.findElement(By.id("email_create")).sendKeys(userEmail);
		driver.findElement(By.id("SubmitCreate")).click();

		List<WebElement> allCheckBoxes = driver.findElements(By.className("radio-inline"));
		allCheckBoxes.get(0).click();

		driver.findElement(By.id("customer_firstname")).sendKeys(fName);
		driver.findElement(By.id("customer_lastname")).sendKeys(lName);
		driver.findElement(By.id("passwd")).sendKeys(password);

		// Select day from days dropdown
		Select selDate = new Select(driver.findElement(By.id("days")));
		selDate.selectByIndex(23);

		// Select month from month dropdown
		Select selMonth = new Select(driver.findElement(By.id("months")));
		selMonth.selectByIndex(9);

		// Select year from dropdown
		Select selYear = new Select(driver.findElement(By.id("years")));
		selYear.selectByIndex(33);

		driver.findElement(By.id("company")).sendKeys(company);
		driver.findElement(By.id("address1")).sendKeys(address);
		driver.findElement(By.id("city")).sendKeys(city);

		// Select state from dropdown
		Select selState = new Select(driver.findElement(By.id("id_state")));
		selState.selectByIndex(46);
		driver.findElement(By.id("postcode")).sendKeys("77079");
		driver.findElement(By.id("phone_mobile")).sendKeys("8327130515");
		driver.findElement(By.id("submitAccount")).click();
		driver.findElement(By.linkText("Sign out")).click();
		driver.findElement(By.id("email")).sendKeys(userEmail);
		driver.findElement(By.id("passwd")).sendKeys(password);
		driver.findElement(By.id("SubmitLogin")).click();
		
		String expectedUserName = fName+" "+lName;
		String actualUserName = driver.findElement(By.className("account")).getText();
		Assert.assertEquals(actualUserName, expectedUserName, "System cannot generate actual user name");
	}

}
