package stepDefinations;

import com.EU6GR4_AY.pages.BasePage;
import com.EU6GR4_AY.pages.IdeasPage;
import com.EU6GR4_AY.pages.ServicesPage;
import com.EU6GR4_AY.utilities.BrowserUtils;
import io.cucumber.java.en.Then;

public class ServicesStepDefs extends IdeasPage {

    ServicesPage servicesPage= new ServicesPage();

    @Then("the user should click the Services button")
    public void the_user_should_click_the_Services_button() {

        BrowserUtils.waitFor(2);
        servicesPage.servicesButton.click();
    }

}
