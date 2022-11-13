package ui.tests;

import common.Log;
import ui.core.driver.DriverFactory;
import common.PropertyReader;
import org.testng.annotations.BeforeClass;
import ui.steps.Login;

public class UiTestTemplate {
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
        Log.info("Logged in successfully as user " + propertyReader.getUsername());
    }
}
