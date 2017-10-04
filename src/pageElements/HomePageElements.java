package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Log;

public class HomePageElements extends BaseClass {

	private static  WebElement element = null;
	private static  String element1 = null;
	
	public HomePageElements(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static String homePage_Title() {
		try {
			element1= driver.findElement(By.cssSelector("h2")).getText();
			Log.info("Title of the page is fetched");
			}
		catch(Exception e) {
			Log.error("Unable to get Home page title");
			throw(e);
							}return element1;
												 }
		
	public static WebElement menuOption_Mobile() {
		try {
			element= driver.findElement(By.xpath(".//*[@id='nav']/ol/li[1]/a"));
			Log.info("Menu Option mobile is displayed");
			}
		catch(Exception e) {
			Log.error("Unable to find Menu Option mobile");
			throw(e);
							}return element;
												 }
	
	public static WebElement menuOption_TV() {
		try {
			element= driver.findElement(By.xpath(".//*[@id='nav']/ol/li[2]/a"));
			Log.info("Menu Option TV is displayed");
			}
		catch(Exception e) {
			Log.error("Unable to find Menu Option TV");
			throw(e);
							}return element;
												 }
	

	


}
