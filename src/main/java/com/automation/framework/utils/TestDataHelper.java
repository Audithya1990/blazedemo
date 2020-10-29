package com.automation.framework.utils;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.automation.framework.core.FrameworkException;

public class TestDataHelper {

	public static Sheet sheet = null;
	public static Workbook workbook = null;

	public static void getTestData() {

	}

	public static void ExcelHelper(String fileName, String sheetName) {
		try {
			if (fileName.endsWith(".xls")) {
				workbook = new HSSFWorkbook(new FileInputStream(fileName));
				sheet = workbook.getSheet(sheetName);
			} else if (fileName.endsWith(".xlsx")) {
				workbook = new XSSFWorkbook(new FileInputStream(fileName));
				sheet = workbook.getSheet(sheetName);
			}

		} catch (Exception exception) {
			new FrameworkException(exception);
		}
	}

}
