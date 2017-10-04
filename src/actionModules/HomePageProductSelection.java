package actionModules;

import pageElements.HomePageElements;
import utilities.Log;

public class HomePageProductSelection {
	
	public static void selectMobileMenu() {
	  try {
		  HomePageElements.menuOption_Mobile().click();
		  Log.info("Menu Option Mobile has been selected");	  
	  }
	  catch(Exception e)
	  {
		  Log.error("Unable to select the option mobile");
		  throw(e);
	  }
  }
  
  

}
