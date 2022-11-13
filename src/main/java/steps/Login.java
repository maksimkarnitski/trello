package steps;

import core.Unilities.PropertyReader;
import pageObject.LoginPage;

public class Login {
    LoginPage loginPage = new LoginPage();
    PropertyReader propertyReader = new PropertyReader();

    public void regularLoginByDefaultUser() {
        loginPage.regularLogin(propertyReader.getUsername(), propertyReader.getPassword());
    }
}
