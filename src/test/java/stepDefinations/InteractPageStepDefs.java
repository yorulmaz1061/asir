package stepDefinations;

import com.EU6GR4_AY.pages.InteractPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class InteractPageStepDefs {

    InteractPage interactPage = new InteractPage();




    @Then("the user should click the send a message box" )
    public void theUserShouldClickTheSendAMessageBox() {

        interactPage.messageButton.click();


    }

    @Then("the user clicks on like button")
    public void the_user_clicks_on_like_button() {
        interactPage.likeLink.click();
    }

    @Then("the user see a text that says You under like link")
    public void the_user_see_a_text_that_says_You_under_like_link() {
        System.out.println("interactPage.likedMessage.getText() = " + interactPage.likedMessage.getText());

        String expectedText="You";

        System.out.println(interactPage.likedMessage.getText());

        String actualText= interactPage.likedMessage.getText().substring(0,3);
        System.out.println("actualText = " + actualText);


        Assert.assertEquals("NOT matched",expectedText,actualText);

//        BrowserUtils.waitFor(2);
//        interactPage.likeLink.click();


    }

}
