
package actionModules;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageElements.MobileListPage;
import utilities.Log;

public class ProductComparison {
	public static WebDriver driver;
	
	public static void compare()throws Exception{
		try {
			MobileListPage.xperiaAddToCompareButton().click();
			Thread.sleep(400);
			MobileListPage.iphoneAddToCompareButton().click();
			Thread.sleep(400);
			MobileListPage.compareButton().click();
			Thread.sleep(400);	
			Log.info("Products added for Comparision");
		}
		catch(Exception e)
		{
			Log.error("Error in product Comparison");
			throw(e);	
		}
	}
	
	public static void verifyProducts(WebDriver driver) throws Exception {
		try {
			
			 for (String handle : driver.getWindowHandles()) {
			    	driver.switchTo().window(handle);
			    	driver.manage().window().setSize(new Dimension(1400,900));
			
			String strHead = ("COMPARE PRODUCTS");
		    String compHead = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div[1]/h1")).getText();	
		    
		    Assert.assertEquals(strHead, compHead);
		    Log.info("pop up loaded sucessfully");
		    
		    String mob1Title = MobileListPage.xperiaTitle().getText();
		    Assert.assertEquals(mob1Title, "SONY XPERIA");
		    Log.info("Mobile 1 added correctly");
			String mob2Title= MobileListPage.iphoneTitle().getText();
			Assert.assertEquals(mob2Title, "IPHONE");
			 Log.info("Mobile 2 added correctly");
			
			
			Log.info("Assertion done successfully");
			driver.findElement(By.xpath(".//*[@id='top']/body/div/div[2]/button")).click();
			 }
		}catch(Exception e) {
			Log.error("Assertion Error in product Comparison" +e);
			
		}
	}
}
