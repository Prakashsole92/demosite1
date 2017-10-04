package actionModules;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageElements.BaseClass;
import pageElements.MobileListPage;
import utilities.Log;
import utilities.Utils;

public class MobilePageSorting extends BaseClass {
	

	public MobilePageSorting(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void sort(String value) throws Exception {
		try {
		Select sortlist = new Select(MobileListPage.sortByOption());
		sortlist.selectByVisibleText(value);
		Thread.sleep(2000);
		Utils.takeScreenshot(driver);
		Thread.sleep(2000);
		Log.info("Sorted Successfully");

		}
		catch(Exception e) {
			Log.error("Unable to sort the elements" + e);
			throw(e);
			
			
		}
	}

}
