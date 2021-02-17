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

      // if(!checkboxTermsAndConditions().isSelected())  ;
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
    @And("^select Date of Birth$")
    public void selectDateOfBirth() throws Throwable {
        Select dobDayValue=new Select(dodDay());
        dobDayValue.selectByVisibleText("11");

        Select dobMonthValue=new Select(dodMonth());
        dobMonthValue.selectByVisibleText("June");

        Select dobYearValue=new Select(dodYear());
        dobYearValue.selectByVisibleText("1986");
    }
    @And("^fill up the rest of required fields and add format of \"(.*?)\" and \"(.*?)\"$")
    public void fillUpAllRequiredFields(String password, String re_typePassword) throws Throwable {
        emailAddress().sendKeys("zzzzz@abv.bg");
        telephone().sendKeys("642636011");
        mobile().sendKeys("642636022");
        addressLine1().sendKeys("calle Pinar del Rey 49 P02 C");
        addressCity().sendKeys("Sao Paulo");
        addressCounty().sendKeys("Sao Paulo");
        postCode().sendKeys("28033");


        Select countryAddress=new Select(selectCountry());
        countryAddress.selectByVisibleText("BRAZIL");

        chooseUserName().sendKeys("xxxxxzzz");
        choosePassword().sendKeys("1111111");
        re_typePassword().sendKeys("1111111");

        Select securityQuestion1=new Select(selectSecurityQuestion1());
        securityQuestion1.selectByVisibleText("In what city or town was your first job?");

        securityAnswer1().sendKeys("Sofia");

        Select securityQuestion2=new Select(selectSecurityQuestion2());
        securityQuestion2.selectByVisibleText("What is your favorite color?");

        securityAnswer2().sendKeys("Green");

        Select selectCurrencyA=new Select(selectCurrency());
        selectCurrencyA.selectByVisibleText("Euros");


    }

    @Then("^validate that error message 'Invalid password. Please retry using a valid password.'appears$")
    public void verifyInvalidPasswordMessage() throws Throwable {
        try {
            validationPasswordMessage().isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String validationPasswordErrorToBeVerified=validationPasswordMessage().getText();
        Assert.assertTrue("Text Not found",validationPasswordErrorToBeVerified.contains("Invalid password. Please retry using a valid password.")||validationPasswordErrorToBeVerified.contains("Confirm password required"));


        //
        // destroyDriver();
    }


    }





