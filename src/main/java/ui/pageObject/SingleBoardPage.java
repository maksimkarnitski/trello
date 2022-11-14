package ui.pageObject;

import ui.core.driver.DriverFactory;
import ui.core.unilities.Wait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingleBoardPage {
    @FindBy(xpath = ".//div[contains(@class, 'board-header')]//h1")
    WebElement boardNameInHeader;

    public SingleBoardPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public String getBoardName() {
        Wait.forElement(boardNameInHeader);
        return boardNameInHeader.getText();
    }
}
