import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActionTask {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.johnlewis.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions mouseAction = new Actions(driver);		
		mouseAction.moveToElement(driver.findElement(By.cssSelector(".primary-link-link--40b4e.primary-link-primary--47562.nav-active"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Mirrors']")).click();

		driver.quit();
	}

}
