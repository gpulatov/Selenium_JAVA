import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign10WebTable {

	public static void main(String[] args) {
		
		
		int rowNum = getCellData("41.00");
		System.out.println(rowNum);

	}
	
	public static int getCellData (String data) {
		
		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		
		//List<WebElement> info = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td"));
		List<WebElement> rowNum = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));

		for (int i = 0; i < rowNum.size(); i++) {
			if (rowNum.get(i).getText().contains(data)) {
				return i+1;
			}
			
		}
		return(-1);
	}
	
	
	
	

}
