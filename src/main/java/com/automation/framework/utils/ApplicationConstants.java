package com.automation.framework.utils;

import java.io.File;

public class ApplicationConstants {

	public static String projectPath = System.clearProperty("user.dir");

	public static final String testDataFileName = "testData.xlsx";

	public static final String testDataSheetName = "Sheet1";

	public static String testDataPath = projectPath + File.separator + "resources" + File.separator + testDataFileName;

	public static String chromerDriverPath = projectPath + File.separator + "resources" + File.separator + "drivers"
			+ File.separator + "chromedriver.exe";
	
	public static String blazeDemoUrl = "https://blazedemo.com/index.php";
	
	public static int dynamicWaitTime = 60;
}
