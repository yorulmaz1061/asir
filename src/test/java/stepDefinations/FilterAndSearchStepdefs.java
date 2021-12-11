package stepDefinations;

import com.EU6GR4_AY.pages.FilterAndSearchPage;
import com.EU6GR4_AY.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FilterAndSearchStepdefs {


        FilterAndSearchPage filterAndSearchPage = new FilterAndSearchPage();

        @When("the user clicks on FilterAndSearch inputbox")
        public void theUserClicksOnFilterAndSearchInputbox() {
            BrowserUtils.waitFor(2);
            filterAndSearchPage.FilterAndSearchButton.click();
            BrowserUtils.waitFor(2);
        }

        @Then("the user should display WorkButton")
        public void theUserShouldDisplayWorkButton() {
            BrowserUtils.waitFor(2);
            Assert.assertTrue(filterAndSearchPage.FilterAndSearchButton.isDisplayed());
            BrowserUtils.waitFor(2);
        }


        @When("the user clicks on WorkButton")
        public void theUserClicksOnWorkButton() {
            BrowserUtils.waitFor(2);
            filterAndSearchPage.WorkButton.click();
            BrowserUtils.waitFor(2);
        }


        @Then("the user should display TaskButton disappered")
        public void theUserShouldDisplayTaskButtonDisappered() {
            BrowserUtils.waitFor(2);
            Assert.assertTrue(filterAndSearchPage.TaskButton.isDisplayed());
        }

        @When("the user closes WorkCloseButton")
        public void theUserClosesWorkCloseButton() {
            BrowserUtils.waitFor(2);
            filterAndSearchPage.WorkCloseButton.click();
            BrowserUtils.waitFor(2);
        }

        @When("the user clicks SaveFilterButton")
        public void theUserClicksSaveFilterButton() {
            BrowserUtils.waitFor(2);
            filterAndSearchPage.SaveFilterButton.click();
            BrowserUtils.waitFor(2);
        }

        @And("the user sendkeys on FilterName")
        public void theUserSendkeysOnFilterName() {

            filterAndSearchPage.FilterName.sendKeys("Ahmet");
            BrowserUtils.waitFor(2);


        }

        @And("the user clicks on SaveButton")
        public void theUserClicksOnSaveButton() {
            BrowserUtils.waitFor(2);
            filterAndSearchPage.SaveButton.click();
            BrowserUtils.waitFor(2);

        }
        @And("the user clicks on SearchButton")
        public void theUserClicksOnSearchButton() {
            BrowserUtils.waitFor(2);
            filterAndSearchPage.SearchButton.click();
            BrowserUtils.waitFor(2);
        }

        @When("the user clicks on TypeInputBox")
        public void theUserClicksOnTypeInputBox() {
            BrowserUtils.waitFor(2);
            filterAndSearchPage.TypeInputBox.click();
            BrowserUtils.waitFor(2);
        }

        @And("the user clicks on PostsButton")
        public void theUserClicksOnPostsButton() {
            BrowserUtils.waitFor(2);
            filterAndSearchPage.PostsButton.click();
            BrowserUtils.waitFor(2);
        }


        @And("the user clicks on PollsButton")
        public void theUserClicksOnPollsButton() {
            BrowserUtils.waitFor(2);
            filterAndSearchPage.PollsButton.click();
            BrowserUtils.waitFor(2);
        }


        @And("the user clicks on SearchInputBoxClosed")
        public void theUserClicksOnSearchInputBoxClosed() {
            BrowserUtils.waitFor(3);
            filterAndSearchPage.SearchInputBoxClosed.click();
            BrowserUtils.waitFor(2);
        }

        @When("the user clicks on DateInputBox")
        public void theUserClicksOnDateInputBox() {
            BrowserUtils.waitFor(2);
            filterAndSearchPage.DateInputBox.click();
            BrowserUtils.waitFor(3);
        }

        @And("the user clicks on YesterdayButton")
        public void theUserClicksOnYesterdayButton() {
            BrowserUtils.waitFor(2);
            filterAndSearchPage.YesterdayButton.click();
            BrowserUtils.waitFor(2);
        }


    }







