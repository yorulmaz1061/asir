package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InteractPage extends BasePage{

    @FindBy(xpath = "(//span[.='Message'])[2]")

    public WebElement messageButton;

    @FindBy(xpath = "(//a[.='Like'])[1]")

    public WebElement likeLink;

    @FindBy(xpath = "(//Div[starts-with(@id, 'bx-ilike-top-users-BLOG_POST')])[1]")

    public WebElement likedMessage;


    @FindBy(xpath = "(//a[.='Add comment'])[1]")
    public WebElement addCommentBox;

    //@FindBy(xpath = "(//*[starts-with(@id,'bx-html-editor')])[1]")
    @FindBy(xpath = "/html/body")
    public WebElement sendMessageBox;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement sendMessageIframe;

    @FindBy(xpath = "//div[.='Some Text']")
    public WebElement verifySendMessage;


    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-sm ui-btn-primary'])[1]")
    public WebElement sendButton;




}
