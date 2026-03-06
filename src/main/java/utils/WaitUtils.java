package utils;

import factory.ConfigReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {
    private static final Logger logger = LogManager.getLogger(SeleniumUtils.class);

    public static WebElement waitForElementToBeVisible(WebDriver webDriver, String xpath) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(Long.parseLong(ConfigReader.get("timeout"))));
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        } catch (Exception e) {
            logger.error(e);
            return null;
        }
    }

    public static WebElement waitForElementToBeClickable(WebDriver webDriver, String xpath) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(Long.parseLong(ConfigReader.get("timeout"))));
        try {
            return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        } catch (Exception e) {
            logger.error(e);
            return null;
        }
    }

    public static void waitForPageToRefresh(WebDriver webDriver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(Long.parseLong(ConfigReader.get("timeout"))));
        try {
            wait.until(ExpectedConditions.stalenessOf(element));
        } catch (Exception e) {
            logger.error(e);
        }
    }
}
