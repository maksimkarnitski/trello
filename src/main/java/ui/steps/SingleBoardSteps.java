package ui.steps;

import ui.pageObject.SingleBoardPage;

public class SingleBoardSteps {
    SingleBoardPage singleBoardPage = new SingleBoardPage();

    public String getBoardName() {
        return singleBoardPage.getBoardName();
    }
}
