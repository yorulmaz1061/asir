package stepDefinations;

import com.EU6GR4_AY.pages.BasePage;
import com.EU6GR4_AY.pages.EmployeePage;
import com.EU6GR4_AY.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.io.File;
import java.util.Locale;

public class EmployeesStepDefs extends BasePage {

   EmployeePage employeePage=new EmployeePage();

    @Then("the user clicks Employees button")
    public void the_user_clicks_Employees_button() {
        employeePage.employeeBtn.click();
    }

    @When("the user should see the company structure")
    public void the_user_should_see_the_company_structure() {

        String expectedtxt="Company Structure\n"+"Arben Istrefi\n"  +"Employees\n" +"315 employees\n" +
                "aa\n" +"Arben Istrefi\n"  +  "AAAA\n"  +"Untitled\n" +"Employees\n" +"1 employee\n" +
                "Ghan\n"+ "Ghan\n"+"Ghan\n"+"Ghan\n"+"Ghan\n" ;

        String actualtxt= employeePage.companyStrc.getText();

        Assert.assertTrue(actualtxt.contains(expectedtxt));

        System.out.println("employeePage.companyStrc.getText() = " + employeePage.companyStrc.getText());
    }

    @When("the user clicks the Find Employee button")
    public void the_user_clicks_the_Find_Employee_button() {
        employeePage.findEmplyBtn.click();
    }

    @Then("the user clicks the search box")
    public void the_user_clicks_the_search_box() {
       employeePage.searchBox.click();
    }

    @Then("the user writes the {string} name")
    public void the_user_writes_the_name(String name) {
        employeePage.searchBox.sendKeys(name);
    }

    @Then("the user clicks the search button")
    public void the_user_clicks_the_search_button() {

        BrowserUtils.waitFor(2);
        employeePage.searchBtn.click();
    }

    @Then("the user should see the name on the page")
    public void the_user_should_see_the_name_on_the_page() {
        BrowserUtils.waitFor(3);

        String expectedName="Arben Istrefi";

        String actualName=employeePage.seenName.getText();
        Assert.assertEquals(expectedName,actualName);

        System.out.println("employeePage.seenName.getText() = " + employeePage.seenName.getText());

    }



    @When("the user clicks the ADD DEPARTMENT button")
    public void theUserClicksTheADDDEPARTMENTButton() {

        employeePage.addDeprtBtn.click();

    }

    @And("the user should write the new departmant name as {string}")
    public void theUserShouldWriteTheNewDepartmantNameAs(String DeprtName) {

        employeePage.departNameBox.sendKeys(DeprtName);

    }


    @And("the user clicks the ADD button")
    public void theUserClicksTheADDButton() {

        employeePage.addBtn.click();
    }


    @Then("the user should see the new department under the Cyber Vet on the page")
    public void theUserShouldSeeTheNewDepartmentUnderTheCyberVetOnThePage() {

        String expectedName= "Ghan";
        String actualName=employeePage.structureTable.getText();
        Assert.assertTrue(expectedName,actualName.contains(expectedName));

    }


    @When("the user clicks the Telephone Directory button")
    public void theUserClicksTheTelephoneDirectoryButton() {

        employeePage.telDrctBtn.click();
    }

    @Then("the user should be see the Telephone Directory page")
    public void theUserShouldBeSeeTheTelephoneDirectoryPage() {

        String expectedTitle= "Telephone Directory";
        String actualTitle= employeePage.telDrctTitle.getText();

        Assert.assertEquals(expectedTitle,actualTitle);

        System.out.println("expectedTitle = " + expectedTitle);

        System.out.println("actualTitle = " + actualTitle);


    }

    @And("the user clicks employee name")
    public void theUserClicksEmployeeName()  {


         employeePage.employeeName.click();

    }
    @And("the user writes {string} message in the message box")
    public void theUserWritesMessageInTheMessageBox(String message) {
            BrowserUtils.waitFor(2);
        employeePage.msgBox.sendKeys(message);

    }
    @And("the user clicks the SEND MESSAGE button")
    public void theUserClicksTheSENDMESSAGEButton() {
        employeePage.sendMsgBtn.click();

    }
    @And("the user clicks the message send button")
    public void theUserClicksTheMessageSendButton() {
        employeePage.msgSendBtn.click();
    }

    @Then("the user sees the message on the message display screen")
    public void theUserSeesTheMessageOnTheMessageDisplayScreen() {

        String expectedMsg="Good Job";
        String actualMsg= employeePage.msgDisplayScreen.getText();

        Assert.assertTrue(actualMsg.contains(expectedMsg));

        System.out.println("actualMsg = " + actualMsg);
        System.out.println("expectedMsg = " + expectedMsg);
    }

    @And("the user clicks the Add More tab button")
    public void theUserClicksTheAddMoreTabButton() {

        employeePage.moreBtn.click();
    }

    @And("the user clicks the Export to Excel button")
    public void theUserClicksTheExportToExcelButton() {

        employeePage.exportBtn.click();
    }


    @And("the user sees the list of names on the  dowloded Excel file")
    public boolean theUserSeesTheListOfNamesOnTheDowlodedExcelFile() {

        File dir = new File("C:\\Users\\Ghan1\\Desktop\\TASK");
        File[] dirContents = dir.listFiles();



        for (int i = 0; i < dirContents.length; i++) {

           // System.out.println("dirContents[i].getName() = " + dirContents[i].getName());
            String expectedname="users";
            String actualname= dirContents[i].getName();
            Assert.assertTrue(actualname.contains(expectedname));

            System.out.println("actualname = " + actualname);
            System.out.println("expectedname = " + expectedname);

            if (dirContents[i].getName().equals("users") ){


                // File has been found, it can now be deleted:
                //dirContents[i].delete();

            }


           return true;
        }
        return false;
    }
}



