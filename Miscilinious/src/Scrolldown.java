import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scrolling down by pixel(x,y)
		//js.executeScript("window.scrollBy(0,2500)");
		
		
		//scroll to visibility of an element
		WebElement element = driver.findElement(By.id("philadelphia-field-email"));
		js.executeScript("arguments[0].scrollIntoView();",element);
		
		
		driver.quit();
		
		
	

	}

}
