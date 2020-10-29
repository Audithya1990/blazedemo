package com.automation.framework.core;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class DriverHelper {
	private static Map<Long, WebDriver> threadDriver = new HashMap<Long, WebDriver> ();
	
	public static void setWebDriver(WebDriver driver) {
		Long threadId;
		try {
			threadId = Thread.currentThread().getId();
			if(!threadDriver.containsKey(threadId)) {
				threadDriver.put(threadId, driver);
			}
		} catch (Exception exception) {
			new FrameworkException(exception);
		}
	}
	
	public static void getWebDriver(WebDriver driver) {
		Long threadId;
		try {
			threadId = Thread.currentThread().getId();
			if(!threadDriver.containsKey(threadId)) {
				threadDriver.get(threadId);
			}
		} catch (Exception exception) {
			new FrameworkException(exception);
		}
	}

}