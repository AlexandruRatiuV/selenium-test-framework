package tests;

import enums.DriverType;
import factory.DriverManager;
import factory.DriverManagerFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.YoutubeMainPage;

public class Tests {
    DriverManager driverManager;
    WebDriver webDriver;

    @Before
    public void initalize() throws InterruptedException {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        webDriver = driverManager.getWebDriver();
        webDriver.get("http://www.youtube.com");

    }

    @Test
    public void assertTitle() {
        Assert.assertEquals("Youtube", webDriver.getTitle());
    }

    @Test
    public void enterSearchBarKeys(){
        YoutubeMainPage youtubeMainPage = new YoutubeMainPage(webDriver);
        youtubeMainPage.clickOnRejectButton();
        Assert.assertEquals(true,youtubeMainPage.searchFor("test").isSearchResultPresent("test"));
    }

    @Test
    public void test(){
        YoutubeMainPage youtubeMainPage = new YoutubeMainPage(webDriver);
        youtubeMainPage.goToLogin().setInputEmail("test");
    }

//    @After
//    public void quitDriver() {
//        webDriver.quit();
//        webDriver = null;
//    }
}
