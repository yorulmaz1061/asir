package pages;

import com.EU6GR4_AY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlphabetPage {

    public AlphabetPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//span[.='Search By Alphabet'] ")
    public WebElement alphabetBtn;

    @FindBy(xpath = "//a[@class='employee-ABC-letter'] [9]  ")
    public WebElement letterbtn;

    @FindBy(xpath = "//*[@id=\"workarea-content\"]/div ")
    public WebElement nametxt;

}
