package com.automation.framework.core;

import com.automation.framework.utils.Logger;

public class FrameworkException extends Exception{

	private static final long serialVersionUID = 1L;

	public FrameworkException(Exception e) {
		Logger.error(e.toString());
		System.out.println(e.toString());
		
	}

}
