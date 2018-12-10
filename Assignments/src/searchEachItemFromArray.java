import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchEachItemFromArray {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String[] intArray = { "honda", "toyota", "ford", "tesla", "bmw" };

		for (int i = 0; i < intArray.length; i++) {
			driver.findElement(By.name("q")).sendKeys(intArray[i]);
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys(Keys.ENTER);
			String txt = driver.findElement(By.id("resultStats")).getText();
			System.out.println(intArray[i] + "-" + txt.substring(txt.indexOf(" "), txt.indexOf(" (")) + " found");
			driver.navigate().back();
		}

	}

}
