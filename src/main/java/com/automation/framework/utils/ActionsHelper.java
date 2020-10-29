package com.automation.framework.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.framework.core.DriverHelper;
import com.automation.framework.core.FrameworkException;

public class ActionsHelper {

	public static void selectByText(WebElement element, String visibleText) {
		Select select = null;
		try {
			select = new Select(element);
			select.selectByVisibleText(visibleText);
		} catch (Exception exception) {
			new FrameworkException(exception);
		}
	}

	public static void setText(WebElement element, String text) {
		try {
			element.click();
			element.sendKeys(text);
		} catch (Exception exception) {
			new FrameworkException(exception);
		}
	}

	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception exception) {
			new FrameworkException(exception);
		}
	}

	public static void waitForElementToBeVisible(WebElement element) {
		WebDriverWait dynamicWait;
		try {
			dynamicWait = new WebDriverWait(DriverHelper.getWebDriver(), ApplicationConstants.dynamicWaitTime);
			dynamicWait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf(element));
		} catch (Exception exception) {
			new FrameworkException(exception);
		}

	}

}
