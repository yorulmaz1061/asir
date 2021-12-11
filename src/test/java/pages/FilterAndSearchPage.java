package pages;

import com.EU6GR4_AY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterAndSearchPage extends BasePage {

    public FilterAndSearchPage() {
        PageFactory.initElements(Driver.get(), this);
    }


@FindBy(xpath = "//input[@id='LIVEFEED_search']")
public WebElement FilterAndSearchButton;

@FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text'])[1]")
public WebElement WorkflowsButton;

@FindBy(xpath = "//*[@id=\"pagetitle\"]")
public WebElement ActivityStream;

@FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-tasks\"]/span")
public WebElement TaskButton;

@FindBy(xpath = "//*[@id=\"LIVEFEED_search_container\"]/div[1]/div[2]")
public WebElement WorkCloseButton;

@FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text'])[3]")
public WebElement AnnouncementsButton;

@FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text'])[4]")
public WebElement MyActivityButton;

@FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text'])[5]")
public WebElement FavoritesButton;

@FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text'])[6]")
public WebElement WorkButton;

@FindBy(xpath = "//*[@id=\"LIVEFEED_search_container\"]/div[1]/div[1]")
public WebElement Work;

@FindBy(xpath = "//span[.='Any date']")
public WebElement DateInputBox;

@FindBy(xpath = "(//div[@data-name='EVENT_ID'])[2]")
public WebElement TypeInputBox;

@FindBy(xpath = "//*[@id=\"CREATED_BY_ID_label\"]")
public WebElement AuthorInputBox;

@FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[2]/div[1]/div[1]/div[1]/div/span[1]")
public WebElement YesterdayButton;

@FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[3]/div[2]/div/button")
public WebElement SearchButton;

@FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[3]/div[1]/span[1]")
public WebElement SaveFilterButton;

@FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[1]/div[2]/div[8]/input")
public WebElement FilterName;

@FindBy(xpath = "//span[@class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")
public WebElement SaveButton;

@FindBy(xpath = "//*[@id=\"popup-window-content-main-filter-control-popup\"]/div/div[1]/div")
public WebElement PostsButton;

@FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[2]/div[1]/div[2]/div[1]/span[1]/span[2]/span[1]")
public WebElement PollsButton;

@FindBy(xpath = "//*[@id=\"LIVEFEED_search_container\"]/div[2]/span[2]")
public WebElement SearchInputBoxClosed;

}
