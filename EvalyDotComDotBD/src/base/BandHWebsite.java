package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BandHWebsite extends Base {

	public static void main(String[] args) throws InterruptedException {
		SetUpDriver();
		navigateURL("https://www.bhphotovideo.com/");
		sendKeys(By.xpath("//input[@id='top-search-input']"), "camera" + Keys.ENTER);
		Thread.sleep(2000);
		click(By.xpath("//a[@href='/c/buy/Digital-Cameras/ci/9811/N/4288586282']"));
		
		List<WebElement> itemList = driver.findElements(By.xpath("//div[@data-selenium='miniProductPage']"));
		System.out.println("Item List Size : " + itemList.size());
		
		// ctrl+shift+c forr comment or comment out
		
//		Home Work: 
//		1. Create a project named 'Ten_Projects'
//		2. Create 10 packages in that project.
//		3. Create 10 classes separately in 10 packages.
//		4. Create another base Package for the base Class
//		5. List the product items of the first web page of 10 sites.
//		
//		Sites are: 
//		1. www.bestbuy.com
//		2. www.daraz.com.bd
//		3. www.amazon.com
//		4. www.bhphotovideo.com
//		5. www.evaly.com.bd
//		6. www.craiglist.org
//		7. www.aliexpress.com
//		8. www.ebay.com
//		9. www.homedepot.com
//		10. www.walmart.com
		
	}
}
