import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base6 {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://oklahomacity.craigslist.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void click(By by) {
		driver.findElement(by).click();
	}

	public void sendKey(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}

	public void close() {
		close();
	}

}
