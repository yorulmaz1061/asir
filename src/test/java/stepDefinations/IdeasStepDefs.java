package stepDefinations;

import com.EU6GR4_AY.pages.BasePage;
import com.EU6GR4_AY.pages.IdeasPage;
import com.EU6GR4_AY.utilities.BrowserUtils;
import com.EU6GR4_AY.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IdeasStepDefs extends BasePage {

    IdeasPage ideasPage= new IdeasPage();

    @Then("the user clicks New Idea button")
    public void the_user_clicks_New_Idea_button() {
        ideasPage.newIdea.click();
    }
    @Then("the user writes Title for New Idea")
    public void the_user_writes_Title_for_New_Idea() {
        ideasPage.titleIdea.sendKeys("forTest");
    }
    @Then("the user writes Idea description")
    public void the_user_writes_Idea_description() {

        Driver.get().switchTo().frame(ideasPage.boxIframe);
        BrowserUtils.waitFor(3);
        ideasPage.ideaDescription.sendKeys("Lets we work together");
        Driver.get().switchTo().defaultContent();
    }
    @Then("the user clicks Suggest New Idea Button")
    public void the_user_clicks_Suggest_New_Idea_Button() {
        ideasPage.suggestNewIdea.click();
    }

    @Then("verify that message is displayed")
    public void verify_that_message_is_displayed() {

        Assert.assertTrue(ideasPage.titleAssert.isDisplayed());
    }

    @Then("the user clicks Ideas button")
    public void the_user_clicks_Ideas_button() {
        ideasPage.ideas.click();
    }

    @Then("the user clicks idea Description box")
    public void the_user_clicks_idea_Description_box() {
        ideasPage.ideaDescription.click();
    }

    @Then("the user clicks like button")
    public void the_user_clicks_like_button() {
        BrowserUtils.waitFor(2);
     ideasPage.likeButton.click();
    }
    @Then("verify that like button is clicked")
    public void verify_that_like_button_is_clicked() {

     Assert.assertTrue(ideasPage.likeButton.isEnabled());
    }

}
