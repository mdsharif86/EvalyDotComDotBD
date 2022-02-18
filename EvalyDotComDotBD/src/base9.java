import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base9 {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://oklahomacity.craigslist.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void click(By by) {
		driver.findElement(by).click();
	}

	public void senKey(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}

	public void close() {
		close();
	}
}