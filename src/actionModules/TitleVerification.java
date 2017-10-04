package actionModules;

import pageElements.HomePageElements;
import utilities.Log;

public class TitleVerification {
	
	
public static void verifyPageTitle() {
		
		try {
			String title = "THIS IS DEMO SITE FOR   ";
			if(HomePageElements.homePage_Title().equals(title)) {
				Log.info("Title has been Verified");
			}
			else {
				Log.error("Error in Title Verification");
			}
		}
		catch(Exception e) {
			Log.error("Unable to verify the page title");
			throw(e);
		}
	}

}
