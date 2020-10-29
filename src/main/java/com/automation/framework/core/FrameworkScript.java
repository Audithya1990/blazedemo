package com.automation.framework.core;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.framework.utils.ApplicationConstants;
import com.automation.framework.utils.TestDataHelper;

public class FrameworkScript extends TestDataHelper {

	public static String browser = "";
	public static WebDriver driver;

	@BeforeMethod
	public static void onInitilise(ITestContext context) {
		try {
			browser = context.getCurrentXmlTest().getParameter("browser").toUpperCase();
			getTestData(context);
			switch (browser) {
			case "CHROME":
				System.setProperty("webdriver.chrome.driver", ApplicationConstants.chromerDriverPath);
				driver = new ChromeDriver();
				DriverHelper.setWebDriver(driver);
				break;
			}

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(ApplicationConstants.blazeDemoUrl);
		} catch (Exception exception) {
			new FrameworkException(exception);
		}
	}

	@AfterMethod
	public static void onCompleted() {
		DriverHelper.quitWebDriver();
	}

}
