package ui.steps;

import common.PropertyReader;
import ui.pageObject.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    PropertyReader propertyReader = new PropertyReader();

    public void regularLoginByDefaultUser() {
        loginPage.regularLogin(propertyReader.getUsername(), propertyReader.getPassword());
    }
}
