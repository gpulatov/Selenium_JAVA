import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5XPATH {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.way2automation.com/angularjs-protractor/registeration/#/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("angular");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"formly_1_input_username_0\"]")).sendKeys("angular");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div[3]/button")).click();

	}

}
