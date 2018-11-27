import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NWCFOOD\\Desktop\\JAVA_SELENIUM\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		System.setProperty("webdriver.gecko.driver", "..\\geckodriver.exe");
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.bestbuy.com/");

		driver2.close();
	}

}
