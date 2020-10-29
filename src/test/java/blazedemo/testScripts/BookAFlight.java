package blazedemo.testScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.framework.core.DriverHelper;
import com.automation.framework.core.FrameworkScript;

import blazedemo.screens.ConfirmationScreenAndActions;
import blazedemo.screens.IndexScreenAndActions;
import blazedemo.screens.PurchaseScreenAndActions;
import blazedemo.screens.ReserveScreenAndActions;

public class BookAFlight extends FrameworkScript {

	@Test
	public static void bookAFlight() {
		IndexScreenAndActions IndexPage = PageFactory.initElements(DriverHelper.getWebDriver(),
				IndexScreenAndActions.class);
		IndexPage.selectSourceAndDestinationCities();
		ReserveScreenAndActions reservePage = PageFactory.initElements(DriverHelper.getWebDriver(),
				ReserveScreenAndActions.class);
		reservePage.selectFlightFromReserveFlightsList();
		PurchaseScreenAndActions purchasePage = PageFactory.initElements(DriverHelper.getWebDriver(),
				PurchaseScreenAndActions.class);
		purchasePage.fillCustomerDetails();
		ConfirmationScreenAndActions confirmPage = PageFactory.initElements(DriverHelper.getWebDriver(),
				ConfirmationScreenAndActions.class);
		confirmPage.verifyConfirmationPage();
	}
}
