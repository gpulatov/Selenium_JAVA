import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignByCSS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.username")).sendKeys("mike");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("abc123");
		driver.findElement(By.cssSelector("[id='Login']")).click();
	}

}
