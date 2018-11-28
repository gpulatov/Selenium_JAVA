import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandleTask {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("button1")).click();
		
		//1st step get all win ids
		Set<String> winIds = driver.getWindowHandles();
		System.out.println(winIds.size());
		
		//all set items and iterate
		Iterator<String> it = winIds.iterator();
		
		//our windows with it.next()
		String mainWindow = it.next();
		String firstWindow = it.next();
		String secondWindow = it.next();
		
		//where we want to go
		driver.switchTo().window(secondWindow);
		String titleSecond= driver.getTitle();
		System.out.println(titleSecond);
		
		driver.switchTo().window(mainWindow);
		String maintitle= driver.getTitle();
		System.out.println(maintitle);
		
		driver.quit();
	}

}
