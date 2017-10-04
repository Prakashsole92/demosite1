package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import utilities.Log;
import utilities.Utils;

public class MobileListPage extends BaseClass {

	private static WebElement element;

	public MobileListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static WebElement sortByOption() throws Exception{
		try {
			element = driver.findElement(By.cssSelector("select[title=\"Sort By\"]"));
			Log.info("Sort option displayed Successfully");
			Thread.sleep(2000);
			
		}
		catch(Exception e) {
			Log.error("Unable to found  sort the list");
			throw(e);
		}
		return element;
}
	
	public static WebElement priceInListPage() throws Exception{
		try {
	
			element = driver.findElement(By.xpath(".//*[@id='product-price-1']/span"));
			Log.info("Price is displayed in the list page");
		}
		catch(Exception e) {
			Log.error("Unable to found price in the list page");
			throw(e);
		}
		return element;
}
	
	public static WebElement addToCartButton() throws Exception{
		try {
	
			element =   driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/button"));
			Log.info("Button is displayed in the list page");
		}
		catch(Exception e) {
			Log.error("Unable to found Button in the list page");
			throw(e);
		}
		return element;
}
	
	public static WebElement xperiaAddToCompareButton() throws Exception{
		try {
			element =driver.findElement(By.xpath(".//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a"));
			Utils.waitForElement(element);
			Log.info("Button is displayed in the list page");
		}
		catch(Exception e) {
			Log.error("Unable to found xperiaAddToCompareButton Button in the list page");
			throw(e);
		}
		return element;
}

	
public static WebElement iphoneAddToCompareButton() throws Exception{
	try {

		element =driver.findElement(By.xpath(".//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a"));
		Log.info("Button is displayed in the list page");
	}
	catch(Exception e) {
		Log.error("Unable to found iphoneAddToCompareButton Button in the list page");
		throw(e);
	}
	return element;
}

public static WebElement iphoneTitle()throws Exception{
	try {
		element= driver.findElement(By.xpath("//h2/a[@title='Sony Xperia']"));
		Log.info("Iphone title selected");
		
	}catch(Exception e) {
		Log.error("Unable to find the Title Element");
		throw(e);
	}
	return element;
}
public static WebElement xperiaTitle()throws Exception{
	try {
		element= driver.findElement(By.xpath("//h2/a[@title='IPhone']"));
		Log.info("Xperia title selected");
		
	}catch(Exception e) {
		Log.error("Unable to find the Title Element");
		throw(e);
	}
	return element;
}


public static WebElement compareButton() {
	
	try {
		element= driver.findElement(By.xpath("//button[@title='Compare']"));
		Log.info("compare Button found and ready to select");
	}catch(Exception e) {
		Log.error("Unable to find compareButton the Compare button" + e);
		throw(e);		
	}
	return element;
}






}


