package com.automation.framework.utils;

import java.util.HashMap;
import org.testng.ITestContext;

import com.automation.framework.core.FrameworkException;

public class TestDataHelper {
	
	public static HashMap<String, String> dataMap = null;

	
	public void getTestData(ITestContext context) {
		ExcelHelper excelReader = null;
		String className = context.getName();
		System.out.println(ApplicationConstants.testDataPath);
		System.out.println(ApplicationConstants.testDataSheetName);
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
