import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();

		int total_iFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(total_iFrames);
		
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("/html/body/a")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("philadelphia-field-email")).sendKeys("user");
		
		driver.quit();
		
		
	}

}
