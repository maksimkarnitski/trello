package ui.definitions;

import io.cucumber.java.en.When;
import ui.pageObject.BoardsPage;

public class BoardsSteps {
    BoardsPage boardsPage = new BoardsPage();

    @When("user creates new board with name {string}")
    public void createNewBoard(String boardName) {
        boardsPage.createNewBoard(boardName);
    }
}
