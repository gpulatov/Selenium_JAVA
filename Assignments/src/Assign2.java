
import org.openqa.selenium.chrome.*;

public class Assign2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NWCFOOD\\Desktop\\JAVA_SELENIUM\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://shop.honda.com/");
		String hondaTitle = driver.getTitle();
		String hondaPartial = hondaTitle.substring(0, hondaTitle.indexOf("Your"));
		// System.out.println(hondaTitle);
		driver.get("https://www.ferrari.com/en-US");
		String ferrariTitle = driver.getTitle();
		String ferrariPartial = ferrariTitle.substring(ferrariTitle.indexOf('F'), (ferrariTitle.indexOf('w') - 1));
		// System.out.println(ferrariTitle);
		String requested = hondaPartial.concat(ferrariPartial);
		System.out.println(requested);

		driver.close();
		driver.quit();

	}

}
