package basePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class Base {
	static WebDriver site;
	public static void SetupMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");
		site = new ChromeDriver();
		site.manage().window().maximize();
		site.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void click(By by) {
		site.findElement(by).click();
	}
	public void sendKey(By by, String value) {
		site.findElement(by).sendKeys(value);
	}
	public void close() {
		site.close();
	}
}
