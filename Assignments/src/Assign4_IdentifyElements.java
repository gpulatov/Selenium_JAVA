import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;

public class Assign4_IdentifyElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NWCFOOD\\Desktop\\JAVA_SELENIUM\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.website.com/sign-in/");
		driver.findElement(By.id("username")).sendKeys("Mike");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("signin-submit2")).click();
		driver.quit();

	}

}
