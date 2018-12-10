import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign9WebTableUsingHashMap {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://forms.zohopublic.com/murodil/report/Applicants/reportperma/DibkrcDh27GWoPQ9krhiTdlSN4_34rKc8ngubKgIMy8");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		Select s = new Select(driver.findElement(By.id("recPerPage")));
		s.selectByIndex(3);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"123524000000428103_tr\"]")));
		List<WebElement> info = driver.findElements(By.xpath("//*[@id=\"reportTab\"]/tbody/tr"));
	
		System.out.println(info.size());
		Map<Integer, String> name = new HashMap<Integer, String>();
		
		String uniqueID;
		String x;
		String applicantInfo;
		
		for (int i=0;i<info.size(); i++) {
			x =info.get(i).getText();
			uniqueID=x.substring(0, 4);
			applicantInfo=x.substring(4);	
			name.put(Integer.parseInt(uniqueID), applicantInfo);
			}
		
		Set<Integer> keys = name.keySet();
		for(int key: keys) {
			System.out.println(key+" : "+ name.get(key));
		}
		

	}

}
