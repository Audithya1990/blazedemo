package com.automation.framework.utils;

import java.io.File;

public class ApplicationConstants {

	public static final String projectPath = System.clearProperty("user.dir");

	public static final String testDataFileName = "testData.xls";

	public static final String testDataSheetName = "Sheet1";

	public static final String testDataPath = projectPath + File.separator + "resources" + File.separator + "testData"
			+ File.separator + testDataFileName;

	public static String chromerDriverPath = projectPath + File.separator + "resources" + File.separator + "drivers"
			+ File.separator + "chromedriver.exe";

	public static final String blazeDemoUrl = "https://blazedemo.com/index.php";

	public static final int dynamicWaitTime = 60;
}
