package tests;

import factory.ConfigReader;
import org.junit.Assert;
import org.junit.Test;
import pages.YoutubeMainPage;

public class Tests extends BaseTest {

    @Test
    public void assertTitle() {
        webDriver.get(ConfigReader.get("baseUrl"));
        Assert.assertEquals("YouTube", webDriver.getTitle());
    }

    @Test
    public void enterSearchBarKeys() {
        webDriver.get(ConfigReader.get("baseUrl"));
        YoutubeMainPage youtubeMainPage = new YoutubeMainPage(webDriver);
        Assert.assertTrue(youtubeMainPage.searchFor("test").isSearchResultPresent("test"));
    }

    @Test
    public void test() {
        webDriver.get(ConfigReader.get("baseUrl"));
        YoutubeMainPage youtubeMainPage = new YoutubeMainPage(webDriver);
        youtubeMainPage.goToLogin().setInputEmail("test");
    }

}
