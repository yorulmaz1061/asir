package stepDefinations;

import com.EU6GR4_AY.pages.BasePage;
import com.EU6GR4_AY.pages.ConfigurePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConfigurationStepDefs extends BasePage {

    ConfigurePage configure = new ConfigurePage();

    @Then("the user click the configure menu")
    public void the_user_click_the_configure_menu() {
    }

    @When("the user click the add custom menu item")
    public void the_user_click_the_add_custom_menu_item() {
    }

    @When("the user enters {string} and {string} information")
    public void the_user_enters_and_information(String string, String string2) {

    }

    @Then("the user should see that item attached the menu")
    public void the_user_should_see_that_item_attached_the_menu() {
    }

}
