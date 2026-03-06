package pages;

import factory.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.SeleniumUtils;

import java.util.List;

public class YoutubeResultPage extends BasePage {
    WebDriver webDriver;
    private final String searchBar = "/html/body/ytd-app/div[1]/div[2]/ytd-masthead/div[4]/div[2]/yt-searchbox/div[1]/div/form/input";
    private final String videoSearchResults = "//*[@id=\"video-title\"]/yt-formatted-string";

    public YoutubeResultPage(WebDriver driver) {
        super(driver);
        this.webDriver = driver;
    }

    public boolean isSearchResultPresent(String text) {
        SeleniumUtils.waitForElementToBeVisible(webDriver, videoSearchResults);
        List<WebElement> list = SeleniumUtils.findElements(webDriver, videoSearchResults);

        for (WebElement e : list) {
            if (e.getText().toLowerCase().contains(text.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    //todo remove this maybe
//    public String getTextFromSearchBar(){
//        return  SeleniumUtils.getTextFromElement(webDriver, searchBar);
//    }

}
