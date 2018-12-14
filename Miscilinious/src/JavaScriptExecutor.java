import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.hotwire.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("farefinder-hotel-destination-input")).sendKeys("new");
		driver.findElement(By.id("farefinder-hotel-destination-input")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("farefinder-hotel-destination-input")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("farefinder-hotel-destination-input")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("farefinder-hotel-destination-input")).sendKeys(Keys.ENTER);
		
		//System.out.println(driver.findElement(By.id("farefinder-hotel-destination-input")).getAttribute("value"));
		
		//Here we using Javascriptexecutor instead of webdriver and getting elements directly from DOM using browser.
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"farefinder-hotel-destination-input\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		driver.close();

	}

}
