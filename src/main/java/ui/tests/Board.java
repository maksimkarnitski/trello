package ui.tests;

import ui.core.driver.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.pageObject.BoardPage;
import ui.pageObject.BoardsPage;

public class Board extends UiTestTemplate {
    BoardsPage boardsPage;
    BoardPage boardPage;

    @BeforeClass
    public void initializeSteps() {
        boardPage = new BoardPage();
        boardsPage = new BoardsPage();
    }

    @Test(description = "Create New Board", priority = 1)
    public void createNewBoard() {
        String boardName = "abc";
        boardsPage.createNewBoard(boardName);
        Assert.assertTrue(boardPage.getBoardName().equals(boardName));
        Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().contains(boardName.toLowerCase()));
    }
}
