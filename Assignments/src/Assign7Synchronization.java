import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign7Synchronization {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.cssSelector("[onclick=\"timedText()\"]")).click();
		
		
		List<WebElement> text= driver.findElements(By.id("demo"));
		System.out.println(text.get(0));
	
	}

}
