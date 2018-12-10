import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign11WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.ussoccer.com/results-statistics");
		driver.manage().window().maximize();
		List<WebElement> cellData = driver.findElements(By.xpath("//*[@id=\"content-wrap\"]/div[3]/div/table/tbody/tr/td"));
		for(WebElement cellInfo : cellData) {
			System.out.println(cellInfo.getText());
		}
		
	}

}
