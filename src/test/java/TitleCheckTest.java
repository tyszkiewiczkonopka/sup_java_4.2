import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class TitleCheckTest extends WebDriverSetup{
    @Test
    @Tag("regression")
    @Tag("sii.pl")
    void siiWebsiteTitleShouldMatchTitleFromSource(){
        String title = "Rozwiązania i usługi IT, inżynierii i BPO - Sii Polska";

        driver.get("https://sii.pl/");
        assertThat(driver.getTitle()).isEqualTo(title);
    }

    @Test
    @Tag("regression")
    @Tag("onet.pl")
    void onetWebsiteTitleShouldMatchTitleFromSource(){
        String title = "Onet – Jesteś na bieżąco";

        driver.get("https://www.onet.pl");
        assertThat(driver.getTitle()).isEqualTo(title);
    }
    @Test
    @Tag("regression")
    @Tag("kotuszkowo.pl")
    void kotuszkowoWebsiteTitleShouldMatchTitleFromSource(){
        String title = "Kotuszkowo- blog o kotach";

        driver.get("http://kotuszkowo.pl/");
        assertThat(driver.getTitle()).isEqualTo(title);
    }
    @Test
    @Tag("regression")
    @Tag("filmweb.pl")
    void filmwebWebsiteTitleShouldMatchTitleFromSource(){
        String title = "Filmweb - filmy takie jak Ty!";

        driver.get("https://www.filmweb.pl/");
        assertThat(driver.getTitle()).isEqualTo(title);
    }
    @Test
    @Tag("regression")
    @Tag("selenium.dev")
    void seleniumWebsiteTitleShouldMatchTitleFromSource(){
        String title = "WebDriver | Selenium";

        driver.get("https://www.selenium.dev/documentation/webdriver/");
        assertThat(driver.getTitle()).isEqualTo(title);
    }
}
