package pages;

import factory.BasePage;
import org.openqa.selenium.WebDriver;
import utils.SeleniumUtils;

public class YoutubeLoginPage extends BasePage {
    private WebDriver webDriver;
    private String inputEmail = "//*[@id=\"identifierId\"]";
    private String nextButton ="//*[@id=\"identifierNext\"]/div/button";

    public YoutubeLoginPage(WebDriver driver) {
        super(driver);
        this.webDriver=driver;
    }

    public void setInputEmail(String email){
        SeleniumUtils.waitForElementToBeVisible(webDriver,inputEmail).sendKeys(email);
        SeleniumUtils.findElement(webDriver,nextButton).click();
    }


}
