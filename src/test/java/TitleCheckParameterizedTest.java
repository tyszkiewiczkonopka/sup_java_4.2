import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.assertj.core.api.Assertions.assertThat;
public class TitleCheckParameterizedTest extends WebDriverSetup {
    @ParameterizedTest
    @Tag("regression")
    @CsvFileSource(files = "src/test/resources/websiteTitles.csv", numLinesToSkip = 1)
    void titleFromCsvShouldBeTheSameAsInWebsiteHtmlHead(String url, String websiteTitle) {
        driver.get(url);
        assertThat(driver.getTitle()).isEqualTo(websiteTitle);
    }
}
