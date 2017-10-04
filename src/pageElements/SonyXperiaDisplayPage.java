package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Log;

public class SonyXperiaDisplayPage extends BaseClass {

	private static WebElement element;


	public SonyXperiaDisplayPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public static WebElement priceInDisplayPage() throws Exception{
		try {
	
			element = driver.findElement(By.xpath(".//*[@id='product-price-1']/span"));
			Log.info("Price is displayed in the display page");
		}
		catch(Exception e) {
			Log.error("Unable to found price in the display page");
			throw(e);
		}
		return element;
}
	

	
}
