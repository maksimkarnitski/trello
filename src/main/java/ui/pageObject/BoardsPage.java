package ui.pageObject;

import ui.core.driver.DriverFactory;
import ui.core.unilities.Wait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardsPage {
    @FindBy(xpath = ".//div[contains(@class, 'all-boards')]//li[@data-test-id='create-board-tile']/div")
    public WebElement createNewBoardTile;

    @FindBy(xpath = ".//section//input[@data-test-id='create-board-title-input']")
    public WebElement createBoardTitleInput;

    @FindBy(xpath = ".//section//button[@data-test-id='create-board-submit-button']")
    public WebElement createBoardSubmitButton;

    @FindBy(xpath = ".//div[@class='board-canvas']")
    public WebElement boardCanvas;

    public BoardsPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public void createNewBoard(String boardName) {
        Wait.forElement(createNewBoardTile);
        createNewBoardTile.click();
        Wait.forElement(createBoardTitleInput);
        createBoardTitleInput.sendKeys(boardName);
        createBoardSubmitButton.click();
    }
}
