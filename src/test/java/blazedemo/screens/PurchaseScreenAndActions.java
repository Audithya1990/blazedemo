package blazedemo.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.automation.framework.utils.ActionsHelper;
import com.automation.framework.utils.TestDataHelper;

public class PurchaseScreenAndActions extends ActionsHelper{

	@FindBy(how = How.XPATH, using = "//input[@id='inputName']")
	static
	WebElement textBox_Name;

	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	static
	WebElement textbox_Address;
	
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	static
	WebElement textbox_City;
	
	@FindBy(how = How.XPATH, using = "//input[@id='zipCode']")
	static
	WebElement textbox_ZipCode;
	
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	static
	WebElement textbox_State;

	@FindBy(how = How.XPATH, using = "//input[@id='creditCardNumber']")
	static
	WebElement textbox_CreditCard;
	
	@FindBy(how = How.XPATH, using = "//input[@id='creditCardMonth']")
	static
	WebElement textbox_Month;
	
	@FindBy(how = How.XPATH, using = "//input[@id='creditCardYear']")
	static
	WebElement textbox_Year;
	
	@FindBy(how = How.XPATH, using = "//input[@id='nameOnCard']")
	static
	WebElement textbox_NameOnCard;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Purchase Flight']")
	static
	WebElement button_PurchaseFlight;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Thank you for your purchase today!')]")
	static
	WebElement ConfirmationHeader;
	
	
	public void fillCustomerDetails() {
		 setText(textBox_Name, TestDataHelper.testData("Name"));
		 setText(textbox_Address, TestDataHelper.testData("Address"));
		 setText(textbox_City, TestDataHelper.testData("City"));
		 setText(textbox_ZipCode, TestDataHelper.testData("ZipCode"));
		 setText(textbox_State, TestDataHelper.testData("State"));
		 setText(textbox_CreditCard, TestDataHelper.testData("CreditCardNumber"));
		 setText(textbox_Month, TestDataHelper.testData("Month"));
		 setText(textbox_Year, TestDataHelper.testData("Year"));
		 setText(textbox_NameOnCard, TestDataHelper.testData("NameOnCard"));
		 click(button_PurchaseFlight);
		 waitForElementToBeVisible(ConfirmationHeader);
		 Assert.assertTrue(ConfirmationHeader.isDisplayed(),"Confirmation Page displayed");
	}
	
	
	
}
