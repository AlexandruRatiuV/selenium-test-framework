package pages;

import factory.BasePage;
import org.openqa.selenium.WebDriver;
import utils.SeleniumUtils;


public class YoutubeMainPage extends BasePage {
    private final WebDriver webDriver;
    private final String searchBar = "/html/body/ytd-app/div[1]/div[2]/ytd-masthead/div[4]/div[2]/yt-searchbox/div[1]/div/form/input";
    private final String searchButton = "//*[@id=\"center\"]/yt-searchbox/div[1]/button";
    private final String rejectCookies = "//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[1]/yt-button-shape/button";
    private final String loginButton = "//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape";

    public YoutubeMainPage(WebDriver driver) {
        super(driver);
        this.webDriver = driver;
        clickOnRejectButton();
    }

    public YoutubeMainPage clickOnRejectButton() {
        SeleniumUtils.waitForElementToBeClickable(webDriver, rejectCookies).click();
        SeleniumUtils.waitForPageToRefresh(webDriver, SeleniumUtils.findElement(webDriver, searchBar));
        return this;
    }

    public YoutubeResultPage searchFor(String query) {
        SeleniumUtils.waitForElementToBeClickable(webDriver, searchBar).sendKeys(query);
        SeleniumUtils.waitForElementToBeClickable(webDriver, searchButton).click();

        return new YoutubeResultPage(webDriver);
    }

    public YoutubeLoginPage goToLogin() {
        SeleniumUtils.waitForElementToBeClickable(webDriver, loginButton).click();
        return new YoutubeLoginPage(webDriver);
    }
}
