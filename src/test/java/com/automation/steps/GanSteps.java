package com.automation.steps;

import com.automation.tools.BrowserType;
import com.automation.tools.Tools;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import static com.automation.pageObjects.RegistrationPO.*;

public class GanSteps extends Tools {


    @Given("^open https://moneygaming.qa.gameaccount.com/$")
    public void open_MoneyGame_page() throws Throwable {
        buildDriver(BrowserType.CHROME);
    }

    @When("^click to ‘Join Now’$")
    public void clickJointNowButton() throws Throwable {
        joinNowButton().click();

    }

    @And("^select a title value from the dropdown$")
    public void selectTitleButton() throws Throwable {
     Select stTitle=new Select(selectTitle());
     stTitle.selectByVisibleText("Mr");
    }

    @And("^enter your first name and surname in the form$")
    public void enterFirstAndSurName() throws Throwable {
     firstName().sendKeys("Jon");
     surName().sendKeys("Anderson");
    }

    @And("^check the tickbox with text I accept the Terms and Conditions and certify that I am over  the age of 18$")
    public void checkTickbox() throws Throwable {
     checkboxTermsAndConditions().click();
    }

   @And("^submit the form by clicking the JOIN NOW button$")
   public void clickOnJoinNowButton() throws Throwable {
  submitJoinNowButton().click();
 }

    @Then("^validate that a validation message with text ‘This field is required’ appears under the date of birth box$")
    public void verifyErrorMessage() throws Throwable {

        String errorTextToBeVerified=dateOfBirdError().getText();
       Assert.assertTrue("Text Not found",errorTextToBeVerified.contains("This field is required"));
        destroyDriver();
    }


    }





