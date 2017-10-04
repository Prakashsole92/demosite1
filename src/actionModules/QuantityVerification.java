package actionModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageElements.BaseClass;
import pageElements.MobileListPage;
import pageElements.ShoppingCartPage;
import utilities.Log;
import utilities.Utils;

public class QuantityVerification extends BaseClass{
	
	public QuantityVerification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void verifyQuantity() throws Exception {
		   try {
			MobileListPage.addToCartButton().click();
			WebElement quan = ShoppingCartPage.qty();
			Utils.waitForElement(quan);
			quan.clear();
			quan.sendKeys("1000");
			ShoppingCartPage.updateButton().click();
			String reqQty = driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[2]/p")).getText();	    
			String msgQty = ("* The maximum quantity allowed for purchase is 500.");    	
			Assert.assertEquals(reqQty, msgQty);
			Log.info("Error message verified");
		}catch(Exception e) {
			Log.error("Unable to verify the quantity");
			throw(e);
		}	
	}

	public static void verifyOutOfStock() throws Exception {
		try {
			
			driver.findElement(By.xpath(".//*[@id='empty_cart_button']")).click();
	        String noItemsStg = ("You have no items in your shopping cart.");
			String noItemsMsg = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div/div[2]/p[1]")).getText();
			Assert.assertEquals(noItemsStg,noItemsMsg );
			Log.info("Out-of-Stock message verified");
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='nav']/ol/li[1]/a")).click();
			Thread.sleep(2000);
			String value = "Position";
			MobilePageSorting.sort( value);
			Thread.sleep(2000);
		}
		catch(Exception e) {
			Log.error("Verification of Error message get failed" + e);
			throw(e);
		}
		
		
		
		
	}
}
