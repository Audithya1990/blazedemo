package com.automation.framework.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;

import com.automation.framework.utils.ApplicationConstants;
import com.automation.framework.utils.TestDataHelper;

public class FrameworkScript extends TestDataHelper{

	public static String browser = "";
	public static WebDriver driver;
	
	public static void onInitilise(ITestContext context) {
		browser = context.getCurrentXmlTest().getParameter("browser").toUpperCase();
		
		switch (browser) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.chromerDriverPath);
			driver = new ChromeDriver();
			DriverHelper.setWebDriver(driver);
			break;

		default:
			break;
		}
		
		
	}
}
