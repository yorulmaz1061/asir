package pages;

import com.EU6GR4_AY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage extends BasePage {

    public AppreciationPage() {

        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy (xpath ="(//span[contains(text(),'Activity Stream')])[1]\t\t\t\t\t\t\t\t\t\t\t\t\t\t" )
    public WebElement ActivityStreamButton;

    @FindBy(xpath = "//span[contains(text(),'more')]")
    public WebElement morebutton;

    @FindBy(xpath = "//span[contains(text(),'Appreciation')]")
    public WebElement AppreciationButton;

    @FindBy(css = "#bx-b-uploadfile-blogPostForm")
    public WebElement UpLoadIcon;

    @FindBy(xpath = "#feed-add-post-destination-input")
    public WebElement addmorebutton;

    @FindBy(xpath = "#destDepartmentTab_destination2368888")
    public WebElement depandemployeebutton;



}
