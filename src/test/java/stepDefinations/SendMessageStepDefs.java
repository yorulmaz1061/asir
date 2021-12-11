package stepDefinations;

import com.EU6GR4_AY.pages.InteractPage;
import com.EU6GR4_AY.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SendMessageStepDefs {

    InteractPage interactPage2 = new InteractPage();

    @Then("the user clicks on the add comment box")
    public void the_user_clicks_on_the_add_comment_box() {
        interactPage2.addCommentBox.click();
    }

    @Then("the user types a text in this box")
    public void the_user_types_a_text_in_this_box() {

//        interactPage2.sendMessageBox.click();
        Driver.get().switchTo().frame(interactPage2.sendMessageIframe);
        interactPage2.sendMessageBox.sendKeys("Some Text");
        Driver.get().switchTo().defaultContent();
    }

    @Then("the user should click the send button")
    public void the_user_should_click_the_send_button() {
        interactPage2.sendButton.click();
    }

    @Then("the user should see the sent text on the page")
    public void the_user_should_see_the_sent_text_on_the_page() {
        System.out.println("Actual Text" + interactPage2.verifySendMessage.getText());

        Assert.assertEquals("Some Text", interactPage2.verifySendMessage.getText());
    }
}
