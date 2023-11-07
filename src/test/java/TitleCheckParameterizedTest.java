import assertions.CustomAssertions;
import logging.LoggerUtil;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TitleCheckParameterizedTest extends WebDriverSetup {
    private final LoggerUtil loggerUtil = new LoggerUtil(this.getClass());

    @ParameterizedTest
    @Tag("regression")
    @CsvFileSource(files = "src/test/resources/websiteTitles.csv", numLinesToSkip = 1)
    void titleFromCsvShouldBeTheSameAsInWebsiteHtmlHead(String url, String websiteTitle) {
        loggerUtil.logStartingParameterizedTest(url);

        driver.get(url);
        CustomAssertions.assertTitleEquals(url, driver, websiteTitle);

        loggerUtil.logEndingParameterizedTest(url);
    }
}
