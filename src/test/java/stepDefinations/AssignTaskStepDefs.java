package stepDefinations;

import com.EU6GR4_AY.pages.AssignTaskPage;
import com.EU6GR4_AY.pages.BasePage;
import com.EU6GR4_AY.pages.FilterAndSearchPage;
import com.EU6GR4_AY.pages.LoginPage;
import com.EU6GR4_AY.utilities.BrowserUtils;
import com.EU6GR4_AY.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AssignTaskStepDefs {

    AssignTaskPage taskPage = new AssignTaskPage();




    //@OPC-421

    @When("clicks on Tasks button")
    public void clicks_on_Tasks_button() {
        BrowserUtils.waitFor(2);
        taskPage.taskButton.click();
        BrowserUtils.waitFor(2);
    }
    @When("clicks on New Task button")
    public void clicks_on_New_Task_button() {
        BrowserUtils.waitFor(2);
        taskPage.newTaskButton.click();
        BrowserUtils.waitFor(2);
    }
    @When("click on high priority checkbox")
    public void click_on_high_priority_checkbox() {
        BrowserUtils.waitFor(1);
        Driver.get().switchTo().frame(taskPage.iframe);
        taskPage.highPriorityCheckbox.click();
        Driver.get().switchTo().defaultContent();
    }
    @Then("User should be able to click high priority checkbox")
    public void user_should_be_able_to_click_high_priority_checkbox() {
        BrowserUtils.waitFor(1);
        Driver.get().switchTo().frame(taskPage.iframe);
        Assert.assertTrue(taskPage.highPriorityCheckbox.isSelected());
        BrowserUtils.waitFor(1);
    }



    //@OPC-422



    @When("Clicks on MESSAGE link button")
    public void clicks_on_MESSAGE_link_button() {
        BrowserUtils.waitFor(2);
        taskPage.messageButton.click();
        BrowserUtils.waitFor(2);
    }
    @When("Click on the A button")
    public void click_on_the_A_button() {
        BrowserUtils.waitFor(2);
        taskPage.visualEditor.click();
        BrowserUtils.waitFor(2);
    }
    @Then("User can display the Visual text editor text bar")
    public void user_can_display_the_Visual_text_editor_text_bar() {
        BrowserUtils.waitFor(2);
        taskPage.visualEditorDisplayed.isDisplayed();
        BrowserUtils.waitFor(2);
    }


    //@OPC-423



    @When("Enter the word demo and click Enter")
    public void enter_the_word_demo_and_click_Enter() {
        BrowserUtils.waitFor(2);
        taskPage.thingsTodoChecklist.sendKeys("demo");
        BrowserUtils.waitFor(2);
        taskPage.checklistOkayButton.click();
        BrowserUtils.waitFor(2);
    }
    @Then("Verify that the user can see the entered text in a new added line with a checkbox")
    public void verify_that_the_user_can_see_the_entered_text_in_a_new_added_line_with_a_checkbox() {
        BrowserUtils.waitFor(2);
        taskPage.demo.isDisplayed();
        BrowserUtils.waitFor(2);
    }

    //@OPC-424


    @When("Click on the separator button")
    public void click_on_the_separator_button() {
        BrowserUtils.waitFor(2);
        taskPage.separatorButton.click();
        BrowserUtils.waitFor(2);
    }
    @Then("User is able to add separator lines")
    public void user_is_able_to_add_separator_lines() {

        BrowserUtils.waitFor(2);
        taskPage.seperatorDisplayed.isDisplayed();
        BrowserUtils.waitFor(2);
    }


    //@OPC-425


    @When("Click on the Things To Do input field")
    public void click_on_the_Things_To_Do_input_field() {
        BrowserUtils.waitFor(2);
        taskPage.thingsTodoChecklist.click();
        BrowserUtils.waitFor(2);
    }
    @When("Enter text demo and click Enter")
    public void enter_text_demo_and_click_Enter() {
        BrowserUtils.waitFor(2);
        taskPage.thingsTodoChecklist.sendKeys("demo");
        BrowserUtils.waitFor(2);
        taskPage.thingsTodoChecklist.isDisplayed();
    }
    @When("Click one the X button")
    public void click_one_the_X_button() {

        BrowserUtils.waitFor(2);
        taskPage.checklistDeleteButton.click();
        BrowserUtils.waitFor(2);
    }
    @Then("User is able to delete the checkbox item")
    public void user_is_able_to_delete_the_checkbox_item() {
        BrowserUtils.waitFor(2);
        taskPage.thingsTodoChecklist.isDisplayed();
        BrowserUtils.waitFor(2);
    }



    //@OPC-426


    @When("Click on the Deadline input field")
    public void click_on_the_Deadline_input_field() {
        BrowserUtils.waitFor(2);
        taskPage.datePicker.click();
        BrowserUtils.waitFor(2);
    }
    @When("Select a date")
    public void select_a_date() {
        BrowserUtils.waitFor(2);
        taskPage.datePicker.click();
        BrowserUtils.waitFor(2);
        taskPage.datePicker.click();
        BrowserUtils.waitFor(2);
    }
    @When("Click on select button")
    public void click_on_select_button() {

        BrowserUtils.waitFor(2);
        taskPage.selectButton.click();
        BrowserUtils.waitFor(2);
    }

      @Then("User is able to display the entered text demo")
    public void user_is_able_to_display_the_entered_text_demo() {

    }


//@OPC-427


    @When("Click on add task button")
    public void click_on_add_task_button() {
        taskPage.addTaskButton.click();
    }
    @Then("User is able to add tasks")
    public void user_is_able_to_add_tasks() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

//@OPC-428

    @When("clicks on the login button")
    public void clicks_on_the_login_button() {
        taskPage.loginButton.click();
    }

    @When("Click on Tasks button")
    public void click_on_Tasks_button() {
        taskPage.taskButton.click();
    }
    @When("Click on New Task button")
    public void click_on_New_Task_button() {
        taskPage.newTaskButton.click();
    }
    @When("Click on the checklist button")
    public void click_on_the_checklist_button() {
        taskPage.checklistButton.click();
    }
    @When("Click on add checklist button")
    public void click_on_add_checklist_button() {
        taskPage.addButtonChecklist.click();
    }
    @Then("User is not able to add a new checklist by leaving input field blank and clicking add button")
    public void user_is_not_able_to_add_a_new_checklist_by_leaving_input_field_blank_and_clicking_add_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}