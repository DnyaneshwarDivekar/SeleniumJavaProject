package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//p[contains(text(),'Welcome to our website!')]")
    private WebElement welcomeMessage;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }
}
