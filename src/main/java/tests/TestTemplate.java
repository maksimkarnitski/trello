package tests;

import core.DriverFactory;
import core.Unilities.PropertyReader;
import org.testng.annotations.BeforeClass;
import steps.Login;

public class TestTemplate {
    PropertyReader propertyReader = new PropertyReader();

    @BeforeClass(description = "config")
    public void configuration() {
        DriverFactory.getDriver().manage().window().maximize();
        DriverFactory.getDriver().get(propertyReader.getLoginUrl());
    }

    @BeforeClass(description = "Login")
    public void login() {
        Login login = new Login();
        login.regularLoginByDefaultUser();
    }
}
