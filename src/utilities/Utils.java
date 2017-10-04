package utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;


public class Utils {
		public static WebDriver driver = null;
	public static WebDriver OpenBrowser() throws Exception{
//	String sBrowserName;
//	sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Browser);
//	System.out.println(sBrowserName);
//	if(sBrowserName.equals("Chrome"))
		try{
			System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
			driver = new ChromeDriver();
			Log.info("New driver instantiated");
			driver.manage().window().setSize(new Dimension(1440, 900));
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    Log.info("Implicit wait applied on the driver for 10 seconds");
		    driver.get(Constant.URL);
		    Log.info("Web application launched successfully");
		}catch (Exception e){
			Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
		}
		return driver;
	}
	
	public static String getTestCaseName(String TestCase)throws Exception{
		String value = TestCase;
		try{
			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			posi = value.lastIndexOf(".");	
			value = value.substring(posi + 1);
			return value;
				}catch (Exception e){
			Log.error("Class Utils | Method getTestCaseName | Exception desc : "+e.getMessage());
			throw (e);
					}
			}
	
	 public static void mouseHoverAction(WebElement mainElement){
		
		 Actions action = new Actions(driver);
         action.moveToElement(mainElement).perform();
         action.click();
         action.perform();
         Log.info("Click action is performed on the sign in");
	 }
	 public static void waitForElement(WebElement element){
		 
		 FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
				 fluentWait.withTimeout(30, TimeUnit.SECONDS);
				 fluentWait.pollingEvery(200, TimeUnit.MILLISECONDS);
				 fluentWait.ignoring(NoSuchElementException.class);
	 	}
		
	 public static void takeScreenshot(WebDriver driver) throws Exception{
			try{
				
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File(Constant.Path_ScreenShot + System.currentTimeMillis() +".jpg"));	
			} catch (Exception e){
				Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());
				throw(e);
			}
		}
	  
}