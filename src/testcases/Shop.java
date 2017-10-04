package testcases;

import org.testng.annotations.Test;

import actionModules.HomePageProductSelection;
import actionModules.MobilePageSorting;
import actionModules.PriceComparision;
import actionModules.ProductComparison;
import actionModules.QuantityVerification;
import actionModules.TitleVerification;
import pageElements.BaseClass;
import utilities.Log;
import utilities.Utils;
import org.testng.annotations.BeforeTest;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Shop {
	
	public WebDriver driver;
	private String TestCaseName;
	 @BeforeTest
	  public void beforeTest() throws Exception {
		  
		  	DOMConfigurator.configure("log4j.xml");
		  	TestCaseName = this.toString();
		  	TestCaseName = Utils.getTestCaseName(this.toString());
		  	Log.startTestCase(TestCaseName);
		  	driver= Utils.OpenBrowser();
			new BaseClass(driver);  
	        }
	 @Test(priority = 0)
	 public void verifyTitle() throws Exception {
		  try {
			  TitleVerification.verifyPageTitle();
			  Thread.sleep(2000);
			  Log.info(Thread.currentThread().getStackTrace()[1].getMethodName()+ "Execution done successfully");
		  }
		 catch(Exception e){
			 Utils.takeScreenshot(driver);
			 Log.error(e.getMessage());
			 Log.error("Error in :" + Thread.currentThread().getStackTrace()[1].getMethodName());
	      }
		  }
	 
  @Test(priority = 1)
  public void selectProduct() throws Exception {
	  try {
		 
		  HomePageProductSelection.selectMobileMenu();
		  Thread.sleep(2000);
		  Log.info(Thread.currentThread().getStackTrace()[1].getMethodName()+ "Execution done successfully");
	  }
	  catch(Exception e)
	  {
		  Utils.takeScreenshot(driver);
		 Log.error(e.getMessage());
		 Log.error("Error in :" + Thread.currentThread().getStackTrace()[1].getMethodName());
      }
	  }
  @Test(priority = 2)
  public void sortProductList() throws Exception {
	  try {
		  String value = "Name";
		  MobilePageSorting.sort( value);
		  Log.info(Thread.currentThread().getStackTrace()[1].getMethodName()+ "Execution done successfully");
	  }
	  catch(Exception e)
	  {
		  Utils.takeScreenshot(driver);
		 Log.error(e.getMessage());
		 Log.error("Error in :" + Thread.currentThread().getStackTrace()[1].getMethodName());
      }
	  }
  
  @Test(priority = 3)
  public void comparePrice() throws Exception {
	  try {
		  PriceComparision.verifyPrice();
		  Log.info(Thread.currentThread().getStackTrace()[1].getMethodName()+ "Execution done successfully"); 
	  }
	   catch(Exception e)
	  {
		   Utils.takeScreenshot(driver);
		 Log.error(e.getMessage());
		 Log.error("Error in :" + Thread.currentThread().getStackTrace()[1].getMethodName());
      }
	  }
	
  	@Test(priority = 4)
	public void verifyQuantity()throws Exception{
		try{
			QuantityVerification.verifyQuantity(); 
			Log.info(Thread.currentThread().getStackTrace()[1].getMethodName()+ "Execution done successfully");
			}
		catch(Exception e){
			Utils.takeScreenshot(driver);
			 Log.error(e.getMessage());
			 Log.error("Error in :" + Thread.currentThread().getStackTrace()[1].getMethodName());
		}
	}

	@Test(priority = 5)
	public void verifyOutOfStock()throws Exception{
		try {
			QuantityVerification.verifyOutOfStock();
			Log.info(Thread.currentThread().getStackTrace()[1].getMethodName()+ "Execution done successfully");
			}
		catch(Exception e){
				Utils.takeScreenshot(driver);
				Log.error(e.getMessage());
				Log.error("Error in :" + Thread.currentThread().getStackTrace()[1].getMethodName());
		}
		} 
	@Test(priority = 6)
	public void productCompare()throws Exception{
		try {
			ProductComparison.compare();
			Log.info(Thread.currentThread().getStackTrace()[1].getMethodName()+ "Execution done successfully");	
	}catch(Exception e) {
		 Utils.takeScreenshot(driver);
		 Log.error(e.getMessage());
		 Log.error("Error in :" + Thread.currentThread().getStackTrace()[1].getMethodName());
		 Thread.sleep(4000);
	}
	}
		
	@Test(priority = 7)
	public void validatepopup()throws Exception{
			try {
				ProductComparison.verifyProducts(driver);
				Log.info(Thread.currentThread().getStackTrace()[1].getMethodName()+ "Execution done successfully");	
		}catch(Exception e) {
			 Utils.takeScreenshot(driver);
			 Log.error(e.getMessage());
			 Log.error("Error in :" + Thread.currentThread().getStackTrace()[1].getMethodName());
		}	
	}
	  
	  
  
   @AfterTest
  public void afterTest() {
	    Log.endTestCase(TestCaseName);
	    driver.quit();
	    
  		}
  


}


