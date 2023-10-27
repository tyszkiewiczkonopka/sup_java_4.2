import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class TitleCheckTest extends WebDriverSetup{
    @ParameterizedTest
    @Tag("regression")
    @Tag("sii.pl")
    @ValueSource(strings = "Rozwiązania i usługi IT, inżynierii i BPO - Sii Polska")
    void siiWebsiteTitleShouldMatchTitleFromSource(String title){
        driver.get("https://sii.pl/");
        assertThat(driver.getTitle()).isEqualTo(title);
    }

    @ParameterizedTest
    @Tag("regression")
    @Tag("onet.pl")
    @ValueSource(strings = "Onet – Jesteś na bieżąco")
    void onetWebsiteTitleShouldMatchTitleFromSource(String title){
        driver.get("https://www.onet.pl");
        assertThat(driver.getTitle()).isEqualTo(title);
    }
    @ParameterizedTest
    @Tag("regression")
    @Tag("kotuszkowo.pl")
    @ValueSource(strings = "Kotuszkowo- blog o kotach")
    void kotuszkowoWebsiteTitleShouldMatchTitleFromSource(String title){
        driver.get("http://kotuszkowo.pl/");
        assertThat(driver.getTitle()).isEqualTo(title);
    }
    @ParameterizedTest
    @Tag("regression")
    @Tag("filmweb.pl")
    @ValueSource(strings = "Filmweb - filmy takie jak Ty!")
    void filmwebWebsiteTitleShouldMatchTitleFromSource(String title){
        driver.get("https://www.filmweb.pl/");
        assertThat(driver.getTitle()).isEqualTo(title);
    }
    @ParameterizedTest
    @Tag("regression")
    @Tag("selenium.dev")
    @ValueSource(strings = "WebDriver | Selenium")
    void seleniumWebsiteTitleShouldMatchTitleFromSource(String title){
        driver.get("https://www.selenium.dev/documentation/webdriver/");
        assertThat(driver.getTitle()).isEqualTo(title);
    }
}
