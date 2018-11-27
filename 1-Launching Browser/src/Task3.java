import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NWCFOOD\\Desktop\\JAVA_SELENIUM\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		String title = driver.getTitle();
		if(title.contains("Computer")) {
			System.out.println("verified");
		}
		System.out.println("not verified");
		driver.close();
		driver.quit();

	}

}
