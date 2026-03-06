package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumUtils extends WaitUtils{
    private static Logger logger = LogManager.getLogger(SeleniumUtils.class);

    public static WebElement findElement(WebDriver webDriver, String xpath){
        try{
            return webDriver.findElement(By.xpath(xpath));
        }
        catch (Exception e){
            logger.error(e);
            return null;
        }
    }

    public static List<WebElement> findElements(WebDriver webDriver, String xpath){
        try{
            return webDriver.findElements(By.xpath(xpath));
        }
        catch (Exception e){
            logger.error(e);
            return null;
        }
    }

    public static String getTextFromElement(WebDriver webDriver, String xpath){
        return findElement(webDriver,xpath).getText();
    }


}
