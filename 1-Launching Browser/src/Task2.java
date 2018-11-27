import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NWCFOOD\\Desktop\\JAVA_SELENIUM\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.dice.com/");
		driver.get("https://www.indeed.com/");
		
		driver.navigate().back();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().forward();
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.quit();

	}

}
