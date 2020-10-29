package blazedemo.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.automation.framework.utils.ActionsHelper;

public class ReserveScreenAndActions extends ActionsHelper {
	
	@FindBy(how = How.XPATH, using = "(//input[@value = 'Choose This Flight'])[1]")
	static
	WebElement button_selectFlight;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Your flight from TLV to SFO has been reserved.')]")
	static
	WebElement header_PurchasePage;

	public void selectFlightFromReserveFlightsList() {
		click(button_selectFlight);
		waitForElementToBeVisible(header_PurchasePage);
		Assert.assertTrue(header_PurchasePage.isDisplayed(), "Purchase page is displayed");
	}

}
