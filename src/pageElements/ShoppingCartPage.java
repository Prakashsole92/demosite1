package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Log;

public class ShoppingCartPage extends BaseClass{

	private static WebElement element;


	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public static WebElement updateButton() throws Exception  {
		try {
			
			element = driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[4]/button"));
			Log.info("Found the Update button field in the shopping cart page");
			}
			catch(Exception e) {
			Log.error("Unable to find the element Update button");
			throw(e);
			}
		return element;
	}
	
	public static WebElement qty() throws Exception  {
		try {
			
			element = driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[4]/input"));
			Log.info("Found the qty field in the shopping cart page");
			}
			catch(Exception e) {
			Log.error("Unable to find the element qty");
			throw(e);
			}
		return element;
	}


}
