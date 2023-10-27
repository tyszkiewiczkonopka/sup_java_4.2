import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetup {
    protected WebDriver driver;
    @BeforeEach
    public void driverSetup() {
        driver = new ChromeDriver();
    }
    @AfterEach
    public void quitDriver() {
        driver.quit();
    }
}
