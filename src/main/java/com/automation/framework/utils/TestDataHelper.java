package com.automation.framework.utils;

import java.util.HashMap;
import org.testng.ITestContext;

import com.automation.framework.core.FrameworkException;

public class TestDataHelper {
	
	public static HashMap<String, String> dataMap = null;

	ExcelHelper excelReader = null;
	public void getTestData(ITestContext context) {
		String className = context.getName();
		excelReader = new ExcelHelper(ApplicationConstants.testDataPath, ApplicationConstants.testDataSheetName);
		dataMap = excelReader.getData(className);
	}
	
	public final static String testData(String columnName) {
		try {
			return dataMap.get(columnName.toString());
		} catch (Exception exception) {
			new FrameworkException(exception);
		}
		return null;
	}

	

}
