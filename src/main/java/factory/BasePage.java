package factory;

import org.openqa.selenium.WebDriver;

public class BasePage {
    private WebDriver webDriver;

    public BasePage (WebDriver driver){
        this.webDriver=driver;
    }

}
