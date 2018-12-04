import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		driver.manage().window().maximize();

		List<WebElement> names = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println(names.size());

		List<WebElement> prices = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println(prices.size());

		String companyName = "Jyoti";
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).getText().equals(companyName)) {
				System.out.println(prices.get(i).getText());
				break;
			}
		}

		// how many total columns

		List<WebElement> columns = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Total rows : " + names.size());
		System.out.println("Total columns : " + columns.size());

	}

}
