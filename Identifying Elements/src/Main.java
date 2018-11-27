import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
public class Main {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NWCFOOD\\Desktop\\JAVA_SELENIUM\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//id locator
		driver.findElement(By.id("login1")).sendKeys("Mike");
		
		//name locator
		driver.findElement(By.name("passwd")).sendKeys("abc123");
		
		//linkText locator
		//driver.findElement(By.linkText("Forgot Password?")).click();
		
		//partialLinkText locator
		driver.findElement(By.partialLinkText("new account")).click();
	}

}
