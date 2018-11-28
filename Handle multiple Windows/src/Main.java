import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Terms']")).click();

		Set<String> windowID = driver.getWindowHandles();
		System.out.println(windowID.size());
		
		Iterator<String> it = windowID.iterator();
		
		String mainWindow = it.next();
		String firstWindow = it.next();
		System.out.println(mainWindow); // here it prints unique window ID = CDwindow-71A0EC31DD8462160D744CC62E50C8D0
		
		driver.switchTo().window(firstWindow);
		
	}

}
