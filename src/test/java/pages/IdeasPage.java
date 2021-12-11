package pages;

import com.EU6GR4_AY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IdeasPage {
    public IdeasPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[2]")
    public WebElement ideas;

    @FindBy(xpath = "(//span[@class='bx-context-button-text'])[1]")
    public WebElement newIdea;

    @FindBy(xpath = "//input[@id='POST_TITLE']")
    public WebElement titleIdea;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement boxIframe;

    @FindBy(xpath ="//body[@contenteditable='true']")
    public WebElement ideaDescription;

    @FindBy(xpath = "//span[@class='t']")
    public WebElement suggestNewIdea;

    @FindBy(xpath = "//a[@class='rating-vote-plus']")
    public WebElement likeButton;

    @FindBy(xpath = "//a[@title='forTest']")
    public WebElement titleAssert;
}
