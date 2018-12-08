import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign8_getText_getAttribute {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.way2automation.com/angularjs-protractor/registeration/#/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("angular");
		System.out.println(userName.getAttribute("value"));
		driver.findElement(By.id("password")).sendKeys("password");
		String pass = driver.findElement(By.name("password")).getAttribute("value");
		System.out.println(pass);
		
		driver.findElement(By.id("formly_1_input_username_0")).sendKeys("angular");
		String name2 = driver.findElement(By.id("formly_1_input_username_0")).getAttribute("value");
		System.out.println(name2);
		driver.findElement(By.cssSelector(".btn.btn-danger")).click();
		String txt = driver.findElement(By.cssSelector("div[class='ng-scope']>p")).getText();
		System.out.println(txt);
		driver.findElement(By.linkText("Logout")).click();

	}

}


