
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
public class Task5Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NWCFOOD\\Desktop\\JAVA_SELENIUM\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://juliemr.github.io/protractor-demo/");
		
		//id locator
		driver.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("6");
		driver.findElement(By.xpath("//select[@ng-model='operator']/option[2]")).click();
		driver.findElement(By.xpath("//*[@id='gobutton']/preceding::input[1]")).sendKeys("2");
		driver.findElement(By.xpath("//*[@ng-model='operator']/following::button")).click();
		
		
		driver.close();
		driver.quit();
		
	}

}