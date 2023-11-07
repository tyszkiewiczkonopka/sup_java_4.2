import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebDriverSetup {
    private Logger logger = LoggerFactory.getLogger("WebDriverSetup");
    protected WebDriver driver;
    @BeforeEach
    public void driverSetup() {
        driver = new ChromeDriver();
        logger.info("WebDriver created");
    }
    @AfterEach
    public void quitDriver() {
        driver.quit();
        logger.info("WebDriver quit");
    }
}
