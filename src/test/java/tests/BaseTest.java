package tests;

import enums.DriverType;
import factory.DriverManager;
import factory.DriverManagerFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver webDriver;

    @Before
    public void setup() {

        DriverManager manager =
                DriverManagerFactory.getDriverManager(DriverType.CHROME);

        webDriver = manager.getWebDriver();
    }

    @After
    public void teardown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

}
