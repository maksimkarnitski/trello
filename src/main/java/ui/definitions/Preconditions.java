package ui.definitions;

import common.Log;
import common.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import ui.core.driver.DriverFactory;

public class Preconditions {
    private PropertyReader property = new PropertyReader();

    @Before
    public void initializeBrowser() {
        Log.info("Initialize browser");
        DriverFactory.getDriver().manage().window().maximize();
        DriverFactory.getDriver().get(property.getLoginUrl());
    }

    @After
    public void closeBrowser() {
        DriverFactory.closeDriver();
    }
}
