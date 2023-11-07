import assertions.CustomAssertions;
import logging.LoggerUtil;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TitleCheckTest extends WebDriverSetup {
    private final LoggerUtil loggerUtil = new LoggerUtil(this.getClass());

    @Test
    @Tag("regression")
    @Tag("sii.pl")
    void siiWebsiteTitleShouldMatchTitleFromSource() {
        String title = "Rozwiązania i usługi IT, inżynierii i BPO - Sii";
        String url = "https://sii.pl/";

        loggerUtil.logStartingTest(url);

        driver.get(url);
        CustomAssertions.assertTitleEquals(url, driver, title);

        loggerUtil.logEndingTest(url);
    }

    @Test
    @Tag("regression")
    @Tag("onet.pl")
    void onetWebsiteTitleShouldMatchTitleFromSource() {
        String title = "Onet – Jesteś na bieżąco";
        String url = "https://www.onet.pl";

        loggerUtil.logStartingTest(url);

        driver.get(url);
        CustomAssertions.assertTitleEquals(url, driver, title);

        loggerUtil.logEndingTest(url);
    }

    @Test
    @Tag("regression")
    @Tag("kotuszkowo.pl")
    void kotuszkowoWebsiteTitleShouldMatchTitleFromSource() {
        String title = "Kotuszkowo- blog o kotach";
        String url = "http://kotuszkowo.pl/";

        loggerUtil.logStartingTest(url);

        driver.get(url);
        CustomAssertions.assertTitleEquals(url, driver, title);

        loggerUtil.logEndingTest(url);
    }

    @Test
    @Tag("regression")
    @Tag("filmweb.pl")
    void filmwebWebsiteTitleShouldMatchTitleFromSource() {
        String title = "Filmweb - filmy takie jak Ty!";
        String url = "https://www.filmweb.pl/";

        loggerUtil.logStartingTest(url);

        driver.get(url);
        CustomAssertions.assertTitleEquals(url, driver, title);

        loggerUtil.logEndingTest(url);
    }

    @Test
    @Tag("regression")
    @Tag("selenium.dev")
    void seleniumWebsiteTitleShouldMatchTitleFromSource() {
        String title = "WebDriver | Selenium";
        String url = "https://www.selenium.dev/documentation/webdriver/";

        loggerUtil.logStartingTest(url);

        driver.get(url);
        CustomAssertions.assertTitleEquals(url, driver, title);

        loggerUtil.logEndingTest(url);
    }
}
