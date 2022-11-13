package pageObject;

import core.DriverFactory;
import core.Unilities.Wait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardPage {
    @FindBy(xpath = ".//div[contains(@class, 'board-header')]//h1")
    WebElement boardNameInHeader;

    public BoardPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public String getBoardName() {
        Wait.forElement(boardNameInHeader);
        return boardNameInHeader.getText();
    }
}
