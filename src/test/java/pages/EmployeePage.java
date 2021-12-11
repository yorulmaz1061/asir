package pages;

import com.EU6GR4_AY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {

    public EmployeePage(){

            PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[10]")
    public WebElement employeeBtn;

    @FindBy(id = "bx_visual_structure")
    public WebElement companyStrc;

    @FindBy(xpath = "//span[.='Find Employee']")
    public WebElement findEmplyBtn;

    @FindBy(xpath = "(//span[.='Add department'] )[1]")
    public WebElement addDeprtBtn;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement departNameBox;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement addBtn;

    @FindBy(xpath = "//div[@class='structure-wrap'] ")
    public WebElement structureTable;

    @FindBy(id = "user-fio")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='bx24-top-bar-search-icon'] ")
    public WebElement searchBtn;

    @FindBy(xpath = "//div[@class='employee-name'] ")
    public WebElement seenName;

    @FindBy(xpath = "(//span[@class='filter-but-text-block'] )[4]")
    public WebElement moreBtn;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[1]")
    public WebElement exportBtn;

    @FindBy(xpath = "(//span[.='Telephone Directory'])[1]")
    public WebElement telDrctBtn;

    @FindBy(xpath = "//span[@class='pagetitle-item' ] ")
    public WebElement telDrctTitle;

    @FindBy(xpath = "(//span[.='Send Message']) [2]")
    public WebElement sendbtn;

    @FindBy(xpath = "(//a[@href='/company/personal/user/479/'])[1]")
    //(//div[@class='bx-user-name'] )[3]")
    public WebElement employeeName;

    @FindBy(xpath = "//span[.='Send message'] ")
    public WebElement sendMsgBtn;

    @FindBy(xpath ="//*[@id=\"bx-desktop-tab-content-im\"]/div/div[3]/div[6]/div[5]/div[7]/textarea")
    //"//textarea[@class='bx-messenger-textarea-input']   ")
    public WebElement msgBox;

    @FindBy(xpath = "//a[@class='bx-messenger-textarea-send-button'] ")
    public WebElement msgSendBtn;

    @FindBy(xpath = "//div[@class='bx-messenger-body-bg']")
    public WebElement msgDisplayScreen;














}
