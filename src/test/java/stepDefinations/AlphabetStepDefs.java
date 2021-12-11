package stepDefinations;

import com.EU6GR4_AY.pages.AlphabetPage;
import com.EU6GR4_AY.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AlphabetStepDefs {

    AlphabetPage alphabetPage=new AlphabetPage();


    @And("the user clicks the Ab Search By Alphabet")
    public void theUserClicksTheAbSearchByAlphabet() {

        alphabetPage.alphabetBtn.click();
    }

    @Then("the user clicks the {string}")
    public void theUserClicksThe(String letter) {

        alphabetPage.letterbtn.click();

    }

    @Then("the user should be see the {string} on the page")
    public void theUserShouldBeSeeTheOnThePage(String employeeName) {


        String expectedName = employeeName;
        String actualName = alphabetPage.nametxt.getText();

        System.out.println("actualnametxt = " + actualName);
        System.out.println("expectedName = " + expectedName);

        Assert.assertTrue(actualName.contains(employeeName));

    }


}





