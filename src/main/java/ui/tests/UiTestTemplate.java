package ui.tests;

import common.Log;
import org.testng.annotations.AfterClass;
import ui.core.driver.DriverFactory;
import common.PropertyReader;
import org.testng.annotations.BeforeClass;
import ui.steps.LoginSteps;

public class UiTestTemplate {
    PropertyReader propertyReader = new PropertyReader();

    @BeforeClass(description = "config")
    public void configuration() {
        Log.info("Initialize browser");
        DriverFactory.getDriver().manage().window().maximize();
        DriverFactory.getDriver().get(propertyReader.getLoginUrl());
    }

    @BeforeClass(description = "Login")
    public void login() {
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.regularLoginByDefaultUser();
        Log.info("Logged in successfully as user " + propertyReader.getUsername());
    }

    @AfterClass(description = "Close driver")
    public void closeDriver() {
        DriverFactory.closeDriver();
    }
}
