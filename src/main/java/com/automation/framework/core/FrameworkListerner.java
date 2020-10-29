package com.automation.framework.core;

import org.testng.ITestContext;
import org.testng.ITestListener;

import com.automation.framework.utils.Logger;

public class FrameworkListerner implements ITestListener{
	
	@Override
	public void onStart(ITestContext context) {
		Logger.info("###################### START ######################");
		System.out.println("Test Case Name" + context.getName() + " has started");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		Logger.info("###################### END ######################");
		System.out.println("Test Case Name" + context.getName() + " was finished");
	}

	

}
