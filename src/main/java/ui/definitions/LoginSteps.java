package ui.definitions;

import common.PropertyReader;
import io.cucumber.java.en.Given;
import ui.pageObject.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    PropertyReader propertyReader = new PropertyReader();

    @Given("default user logs in")
    public void regularLoginByDefaultUser() {
        loginPage.regularLogin(propertyReader.getUsername(), propertyReader.getPassword());
    }
}
