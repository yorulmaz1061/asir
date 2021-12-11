package pages;

import com.EU6GR4_AY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignTaskPage extends BasePage {
    public AssignTaskPage(){


        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/div[1]/ul/li[3]/a/span[1]")
    public WebElement taskButton; //click

    @FindBy(xpath = "//*[@id=\"tasks-buttonAdd\"]")
    public WebElement newTaskButton; //click

    @FindBy(xpath = "//*[@id=\"tasks-task-priority-cb\"]") //iframe

    public  WebElement highPriorityCheckbox; //click

    @FindBy(xpath = "//*[@id=\"task-form-bitrix_tasks_task_default_1\"]/div[1]/div[1]/div[1]/input[2]")
    public WebElement highPriorityCheckboxDisplayed; //is displayed

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-message\"]/span")
    public  WebElement messageButton; // click

    @FindBy(xpath = "//*[@id=\"blog-submit-button-save\"]")
    public WebElement saveButton; //is displayed //click

    @FindBy(xpath = "//*[@id=\"lhe_button_editor_blogPostForm\"]")
    public WebElement visualEditor; // click

    @FindBy(xpath = "//*[@id=\"bx-html-editor-tlbr-idPostFormLHE_blogPostForm\"]/span[2]/span[1]")
    public WebElement visualEditorDisplayed; //is displayed

    @FindBy (xpath = "//*[@id=\"post-buttons-bottom\"]/span[5]")
    public WebElement checklistButton; //click

    @FindBy(xpath = "//*[@id=\"bx-component-scope-lifefeed_task_form\"]/div/div[1]/div[1]/div[2]/input")
    public WebElement thingsToDoMessage; //click.sendkeys

    @FindBy(xpath ="//*[@id=\"blogPostEditCreateTaskPopup\"]/div[2]/span")
    public WebElement popUpViewTask; //is displayed

    @FindBy(xpath = "//*[@id=\"task-form-bitrix_tasks_task_default_1\"]/div[1]/div[1]/div[2]/input")
    public WebElement thingsToDoTask; //click.sendkeys

    @FindBy(xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_default_1-checklist\"]/div[3]/div/span[2]/span")
    public  WebElement separatorButton; //click

    @FindBy (xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_default_1-checklist\"]/div[2]/div[2]/div[2]")
    public WebElement seperatorDisplayed; //is displayed

    @FindBy (xpath ="//*[@id=\"bx-component-scope-bitrix_tasks_task_default_1-checklist\"]/div[3]/span/span/input")
    public WebElement thingsTodoChecklist; //click.sendkeys

    @FindBy (xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_default_1-checklist\"]/div[3]/div/span[1]/span")
    public WebElement addButtonChecklist; //click

    @FindBy(xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_default_1-checklist\"]/div[2]/div[2]/div[1]/div/span[4]")
    public WebElement deleteChecklistButton; //click // is not displayed

    @FindBy(xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_default_1-checklist\"]/div[2]/div[2]/div[1]/div/label/span[2]")
    public WebElement createdChecklist;

@FindBy(xpath = "//*[@id=\"login-popup\"]/form/div[2]/input")
public WebElement loginButton;

@FindBy(xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_default_1-checklist\"]/div[3]/span/span/span[1]")
    public WebElement checklistOkayButton;

@FindBy(xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_default_1-checklist\"]/div[2]/div[2]/div[1]/div/span[4]")
public WebElement checklistDeleteButton;

@FindBy(xpath = "//*[@id=\"task-form-bitrix_tasks_task_default_1\"]/div[3]/div[2]/div/div[1]/span[1]/span/input[1]")
public WebElement datePicker;

@FindBy(xpath = "//*[@id=\"popup-window-content-calendar_popup_0.1740463740949263\"]/div/div[5]/a[1]/span[2]")
public WebElement selectButton;

@FindBy(xpath = "//*[@id=\"task-form-bitrix_tasks_task_default_1\"]/div[5]/div/button[1]")
public WebElement addTaskButton;

@FindBy(xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_default_1-checklist\"]/div[2]/div[2]/div[1]/div/label/span[2]")
    public WebElement demo;

@FindBy(className = "side-panel-iframe")
    public WebElement iframe;


}