package com.automation.framework.utils;

import java.util.HashMap;
import org.testng.ITestContext;

public class TestDataHelper {
	
	public HashMap<String, String> dataMap = null;

	ExcelHelper excelReader = null;
	public void getTestData(ITestContext context) {
		String className = context.getName();
		excelReader = new ExcelHelper(ApplicationConstants.testDataPath, ApplicationConstants.testDataSheetName);
		dataMap = excelReader.getData(className);
	}

	

}
