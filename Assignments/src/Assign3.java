
import org.openqa.selenium.chrome.*;

public class Assign3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NWCFOOD\\Desktop\\JAVA_SELENIUM\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.get("http://www.fanniemae.com/portal/index.html");
		driver.get("https://www.bcbs.com/");
		driver.get("https://www.ibm.com/us-en/?lnk=m");
		driver.get("https://www.mcdonalds.com/us/en-us.html");

		driver.navigate().to("https://www.bcbs.com/");
		driver.navigate().to("https://www.ibm.com/us-en/?lnk=m");
		driver.navigate().to("http://www.fanniemae.com/portal/index.html");
		String url = driver.getCurrentUrl();
		System.out.println("This is my company: " + url);

		driver.close();
		driver.quit();

	}

}
