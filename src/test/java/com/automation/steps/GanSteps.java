package com.automation.steps;

import com.automation.tools.BrowserType;
import com.automation.tools.Tools;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import static com.automation.pageObjects.RegistrationPO.*;
import static com.automation.pageObjects.ContactUsPO.*;
import static com.automation.tools.SeleniumWebDriver.getWebDriver;

public class GanSteps extends Tools {

   //ContactUSForm
    @Given("^open http://www.musala.com/$")
    public void open_Musala_web_page() throws Throwable {
        buildDriver(BrowserType.CHROME);
    }

    @When("^scroll down and go to ‘Contact Us’$")
    public void clickContactUsButton() throws Throwable {
        ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", getContactUsButton());
        getContactUsButton().click();
    }

    @And("^fill all required fields except email$")
    public void verifyThatLoginPageIsOpen() throws Throwable {

        nameField().sendKeys("Jonh Week");
        emailField();
        mobileNumberField().sendKeys("+359888546263");
        subjectField().sendKeys("Question");
        yourMessage().sendKeys("Hello...");

    }

    @And("^under email field enter string with wrong email format \"(.*?)\"$")
    public void enterWrongEmail(String wrongEmail) throws Throwable {
        emailField().sendKeys(wrongEmail);
    }

    @And("^click Send button$")
    public void clickSend() throws Throwable {
        sendButton().click();
    }
    @Then("^verify that error message The e-mail address entered is invalid. appears$")
    public void verifyErrorMessage() throws Throwable {
        String errorTextToBeVerified=errorMessageText().getText();
        Assert.assertTrue("Text Not found",errorTextToBeVerified.contains("The e-mail address entered is invalid."));
        destroyDriver();
    }
    //CompanyTab
    @When("^click ‘Company’ tap from the top$")
    public void clickCompanyTab() throws Throwable {
        companyTab().click();

    }

    @And("^verify that the correct URL http://www.musala.com/company/ loads$")
    public void verifyURLCompany() throws Throwable {
       String companyURL= getWebDriver().getCurrentUrl();
        System.out.println(companyURL);
        Assert.assertTrue("URL is not loaded",companyURL.contains("https://www.musala.com/company/"));
    }

    @And("^verify that there is Leadership section$")
    public void verifyLeadershipSection() throws Throwable {
        ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", companyMembers());
       if(companyMembers().isDisplayed()) {
           System.out.println(companyMembers().getText());
       }else{
           System.out.println("Leadership section is not shown");
       }

    }
    @And("^click the Facebook link from the footer$")
    public void clickOnFacebookLink() throws Throwable {
        ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", facebookLink());
        facebookLink().click();
    }
    @Then("^verify that the correct facebook URL loads$")
    public void verifyFacebookLinkIsOpen() throws Throwable {
        switchWindows();
        String facebookURL= getWebDriver().getCurrentUrl();
        System.out.println(facebookURL);
        Assert.assertTrue("Facebook URL is not loaded",facebookURL.contains("https://www.facebook.com/MusalaSoft?fref=ts"));
    }

    }





