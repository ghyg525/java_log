package logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

	final static Logger logger = LoggerFactory.getLogger(Test.class);
	
	    public static void main(String[] args) {
	        logger.trace("trace");
	        logger.debug("debug {} debug", "slf4j");
	        logger.info("info");
	        logger.warn("warn");
	        logger.error("error");
	    }
}
