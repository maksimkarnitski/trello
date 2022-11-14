package ui.definitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import ui.core.driver.DriverFactory;
import ui.pageObject.SingleBoardPage;

public class SingleBoardSteps {
    SingleBoardPage singleBoardPage = new SingleBoardPage();

    @Then("verify created board with name {string} is opened")
    public void getBoardName(String createdBoardName) {
        Assert.assertEquals(singleBoardPage.getBoardName(), createdBoardName);
    }
}
