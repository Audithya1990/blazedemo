package blazedemo.screens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.automation.framework.core.DriverHelper;
import com.automation.framework.utils.ActionsHelper;

public class ReserveScreenAndActions extends ActionsHelper {

	public static void selectFlightFromReserveFlightsList() {
		List<WebElement> chooseFlights = DriverHelper.getWebDriver()
				.findElements(By.xpath("//input[@value = 'Choose This Flight']"));
		WebElement chooseFlight = chooseFlights.get(0);
		click(chooseFlight);
		WebElement PurchaseScreenHeader = DriverHelper.getWebDriver()
				.findElement(By.xpath("//h2[contains(text(),'Your flight from TLV to SFO has been reserved.')]"));
		waitForElementToBeVisible(PurchaseScreenHeader);
		Assert.assertTrue(PurchaseScreenHeader.isDisplayed(), "Purchase page is displayed");
	}

}
