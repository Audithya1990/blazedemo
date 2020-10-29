package blazedemo.testScripts;

import org.testng.annotations.Test;

import com.automation.framework.core.FrameworkScript;

import blazedemo.screens.ConfirmationScreenAndActions;
import blazedemo.screens.IndexScreenAndActions;
import blazedemo.screens.PurchaseScreenAndActions;
import blazedemo.screens.ReserveScreenAndActions;

public class BookAFlight extends FrameworkScript{
	
	@Test
	public void bookAFlight() {
		IndexScreenAndActions.selectSourceAndDestinationCities();
		ReserveScreenAndActions.selectFlightFromReserveFlightsList();
		PurchaseScreenAndActions.fillCustomerDetails();
		ConfirmationScreenAndActions.verifyConfirmationPage();
	}

}
