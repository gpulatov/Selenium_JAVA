import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
public class Task4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NWCFOOD\\Desktop\\JAVA_SELENIUM\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		
		//id locator
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		if(title.contains("Find a Flight")) {
			System.out.println("verified");
		}else {
		System.out.println("not verified");
		}
		
		driver.close();
		driver.quit();
		
	}

}
