package com.learning.logfourj.LogCourse1;

import org.apache.log4j.Logger;

public class Custom {
	
	public static Logger logger = Logger.getLogger(Custom.class);
	
	public void display(){
		logger.debug("Custom: This is DEBUG");
		logger.info("Custom: This is INFO");
		logger.warn("Custom: This is WARN");
		logger.error("Custom: This is ERROR");
		logger.fatal("Custom: This is FATAL");
	}
		
}
