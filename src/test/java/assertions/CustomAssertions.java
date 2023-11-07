package assertions;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomAssertions{
    private static final Logger logger = LoggerFactory.getLogger(CustomAssertions.class);

    public static void assertTitleEquals(String url, WebDriver driver, String expectedTitle) {
        String failMessage = "Assertion failed for website " + url + ". EXPECTED VALUE: " + expectedTitle + " BUT WAS: " + driver.getTitle();

        try {
            assertThat(driver.getTitle()).isEqualTo(expectedTitle);
        } catch (AssertionError e) {
            logger.error(failMessage);
            throw e;
        }
    }


}