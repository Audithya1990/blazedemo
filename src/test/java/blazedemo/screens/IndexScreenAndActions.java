package blazedemo.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.automation.framework.core.DriverHelper;
import com.automation.framework.utils.ActionsHelper;
import com.automation.framework.utils.TestDataHelper;

public class IndexScreenAndActions extends ActionsHelper {

	@FindBy(name = "fromPort")
	static
	WebElement dropDown_DepartureCity;

	@FindBy(how = How.XPATH, using = "//select[@name='toPort']")
	static
	WebElement dropDown_DestinationCity;

	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	static
	WebElement button_FindFlights;

	public static void selectSourceAndDestinationCities() {

		selectByText(dropDown_DepartureCity, TestDataHelper.testData("SourceCity"));
		selectByText(dropDown_DestinationCity, TestDataHelper.testData("DestinationCity"));
		click(button_FindFlights);
		WebElement reservePageheader = DriverHelper.getWebDriver()
				.findElement(By.xpath("//h3[contains(text(),'Flights from Paris to Buenos Aires:')]"));
		waitForElementToBeVisible(reservePageheader);
		Assert.assertTrue(reservePageheader.isDisplayed(), "Reservation page is displayed");

	}

}
