package pages;

import com.EU6GR4_AY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigurePage {
    public ConfigurePage(){

        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(xpath = "//*[@id='left-menu-settings']")
    public WebElement configureMenu;
    @FindBy(xpath = "//*[text() = 'Configure menu items']")
    public WebElement configureMenuItem;
    @FindBy(xpath = "//*[text() = 'Collapse menu']")
    public WebElement collapseMenu;
    @FindBy(xpath = "//*[text() = 'Add custom menu item']")
    public WebElement addCustomMenu;
    @FindBy(xpath = "//*[text() = 'Reset menu']")
    public WebElement resetMenu;
    @FindBy(xpath = "//input[@name = 'menuPageToFavoriteName']")
    public WebElement customMenuName;
    @FindBy(xpath = "//input[@name = 'menuPageToFavoriteLink']")
    public WebElement customMenulink;
    @FindBy(xpath = "//span[@class = 'popup-window-button popup-window-button-create popup-window-button-wait']")
    public WebElement customMenuItemAddBtn;




}
