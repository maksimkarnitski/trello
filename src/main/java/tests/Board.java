package tests;

import core.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.BoardPage;
import pageObject.BoardsPage;

public class Board extends TestTemplate {
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
