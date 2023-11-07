package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {
    private final Logger logger;
    public LoggerUtil(Class<?> clazz) {
        this.logger = LoggerFactory.getLogger(clazz);
    }
    public void logStartingTest(String url) {
        String message = "Starting test for " + url;
        logger.info(message);
    }

    public void logEndingTest(String url) {
        String message = "Ending test for " + url;
        logger.info(message);
    }

    public void logStartingParameterizedTest(String url){
        String message = "Executing test with value: " + url;
        logger.info(message);
    }
    public void logEndingParameterizedTest(String url){
        String message = "Ending test with value: " + url;
        logger.info(message);
    }

}
