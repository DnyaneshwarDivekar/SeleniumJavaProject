package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	@FindBy(xpath ="//a[normalize-space()='Login']")
	private WebElement loginLink;

    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='button']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    
    public void navigateToLogin() {
    	
    	
    }

    public void login(String username, String password) {
    	loginLink.click();
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
