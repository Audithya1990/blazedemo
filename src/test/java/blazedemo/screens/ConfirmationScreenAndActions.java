package blazedemo.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ConfirmationScreenAndActions {

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Thank you for your purchase today!')]")
	static
	WebElement header_ThaksConfirmation;

	@FindBy(how = How.XPATH, using = "//pre[contains(text(),'PendingCapture')]")
	static
	WebElement textarea_json;
	
	public void verifyConfirmationPage() {
		Assert.assertTrue(header_ThaksConfirmation.isDisplayed(),"Confirmation Screen Displayed");
		Assert.assertTrue(textarea_json.isDisplayed(),"Json Text area is  Displayed");
	}

}
