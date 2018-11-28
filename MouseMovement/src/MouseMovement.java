import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.americangolf.co.uk/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions mouseAction = new Actions(driver);
		mouseAction.moveToElement(driver.findElement(By.cssSelector("#header-navigation > div.header-navigation-left > ul > li:nth-child(3) > a"))).build().perform();
		driver.findElement(By.cssSelector("#CLUBS_1 > ul > li:nth-child(3) > ul > li > a > span")).click();


	}

}
