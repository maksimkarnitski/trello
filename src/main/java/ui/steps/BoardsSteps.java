package ui.steps;

import ui.pageObject.BoardsPage;

public class BoardsSteps {
    BoardsPage boardsPage = new BoardsPage();

    public void createNewBoard(String boardName) {
        boardsPage.createNewBoard(boardName);
    }
}
