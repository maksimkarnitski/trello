package pageObject;

import core.DriverFactory;
import core.Unilities.Wait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = ".//form[@id='login-form']//input[@id='user']")
    public WebElement usernameInput;

    @FindBy(xpath = ".//form[@id='login-form']//input[@id='login']")
    public WebElement loginButton;

    @FindBy(xpath = ".//form[@id='form-login']//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = ".//form[@id='form-login']//button[@id='login-submit']")
    public WebElement loginSubmitButton;

    public LoginPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public void regularLogin(String username, String password) {
        usernameInput.sendKeys(username);
        loginButton.click();
        Wait.forElement(passwordInput);
        passwordInput.sendKeys(password);
        loginSubmitButton.click();
    }
}
