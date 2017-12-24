package com.learning.logfourj.LogCourse;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.learning.logfourj.LogCourse1.Custom;

/**
 * Hello world!
 *
 */
public class App 
{
	final static Logger logger = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	PropertyConfigurator.configure("log4j.properties");
    	
    	logger.debug("This is DEBUG");
        logger.info("This is INFO");
        logger.warn("This is WARN");
        logger.error("This is ERROR");
        logger.fatal("This is FATAL");
        
        Custom cus = new Custom();
        cus.display();
        
    	//App app = new App();   
    }
    
    /*
    public void doLogMessage(){
    	//logger.trace("This is TRACE");
    	logger.debug("This is DEBUG");
        logger.info("This is INFO");
        logger.warn("This is WARNING");
        logger.error("This is ERROR");
        logger.fatal("This is FATAL");
    }
    */
}
