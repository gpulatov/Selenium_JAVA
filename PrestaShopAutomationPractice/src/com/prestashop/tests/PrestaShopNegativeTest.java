package com.prestashop.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrestaShopNegativeTest {
	
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
		driver.findElement(By.id("email")).sendKeys("ggg@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("ggg123");
		driver.findElement(By.id("SubmitLogin")).click();
		
		Assert.assertTrue(isDisplayed(), "Authentication failed. msg is not displayed");
	}

	private boolean isDisplayed() {
		
		if(driver.findElement(By.xpath("//*[@id=\'center_column\']/div[1]/ol/li")).isDisplayed()) {
			return true;
		}
		return false;
	}
	
	@Test
	public void invalidEmailTest() {
		driver.findElement(By.id("email")).sendKeys("ggg.gmail");
		driver.findElement(By.id("passwd")).sendKeys("ggg123");
		driver.findElement(By.id("SubmitLogin")).click();
		
		Assert.assertTrue(isDisplayed(), "invalid email. msg is not displayed");
	}
	
	@Test
	public void blankEmailTest() {
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("passwd")).sendKeys("ggg123");
		driver.findElement(By.id("SubmitLogin")).click();
		
		Assert.assertTrue(isDisplayed(), "An email address required. msg is not displayed");
	}
	
	@Test
	public void blankPasswordTest() {
		driver.findElement(By.id("email")).sendKeys("ggg@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("");
		driver.findElement(By.id("SubmitLogin")).click();
		
		Assert.assertTrue(isDisplayed(), "Password is required. msg is not displayed");
	}

}
