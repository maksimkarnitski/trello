package ui.tests;

import common.Log;
import ui.core.driver.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.steps.BoardsSteps;
import ui.steps.SingleBoardSteps;

public class Board extends UiTestTemplate {
    BoardsSteps boardsSteps;
    SingleBoardSteps singleBoardSteps;

    @BeforeClass
    public void initializeSteps() {
        boardsSteps = new BoardsSteps();
        singleBoardSteps = new SingleBoardSteps();
    }

    @Test(description = "Create New Board", priority = 1)
    public void createNewBoard() {
        String boardName = "New Board";
        boardsSteps.createNewBoard(boardName);
        Log.info("Board with name " + boardName + " is created");
        Assert.assertEquals(singleBoardSteps.getBoardName(), boardName);
        Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().contains(boardName.toLowerCase().replace("\s", "-")));
    }
}
