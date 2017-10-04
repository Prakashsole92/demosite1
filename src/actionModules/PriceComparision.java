package actionModules;

import org.testng.Assert;

import pageElements.MobileListPage;
import pageElements.SonyXperiaDisplayPage;
import utilities.Log;

public class PriceComparision {
	public static void verifyPrice() throws Exception {
			
		try {
			Assert.assertEquals(MobileListPage.priceInListPage(),SonyXperiaDisplayPage.priceInDisplayPage());
			Log.info("Both the price values are matched");
		}	
		catch (Exception e) {
			Log.error("Price values are not matched");
			throw(e);
		}
	}

}
