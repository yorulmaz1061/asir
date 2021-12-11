package pages;

import com.EU6GR4_AY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage {
    public ServicesPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[11]")
    public WebElement servicesButton;





}
