package stepDefinations;

import com.EU6GR4_AY.pages.AppreciationPage;
import com.EU6GR4_AY.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AppreciationStepDefs {

    AppreciationPage appreciationPage = new AppreciationPage();

    @Then("the user should click the activitystream button")
    public void the_user_should_click_the_activitystream_button() {
        BrowserUtils.waitFor(2);
        appreciationPage.ActivityStreamButton.click();
    }

    @When("the user click on the more button")
    public void the_user_click_on_the_more_button() {
        BrowserUtils.waitFor(2);
        appreciationPage.morebutton.click();
    }

    @When("the user click on appreciation button")
    public void the_user_click_on_appreciation_button() {
       appreciationPage.AppreciationButton.click();
    }

    @Then("the user should see uploadfile icon")
    public void the_user_should_see_uploadfile_icon() {
        Assert.assertTrue(appreciationPage.UpLoadIcon.isDisplayed());
    }

}
