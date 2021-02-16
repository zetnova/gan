package com.automation.pageObjects;

import com.automation.tools.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPO extends Tools {


    static synchronized public WebElement joinNowButton() throws Exception {
        return findElementBy(By.xpath("//a[@href='/sign-up.shtml']"));
    }

    static synchronized public WebElement selectTitle() throws Exception {
        return findElementBy(By.id("title"));
    }
    static synchronized public WebElement firstName() throws Exception {
        return findElementBy(By.xpath("//input[@name='map(firstName)']"));
    }
    static synchronized public WebElement surName() throws Exception {
        return findElementBy(By.xpath("//input[@name='map(lastName)']"));
    }
    static synchronized public WebElement checkboxTermsAndConditions() throws Exception {
        return findElementBy(By.xpath("//input[@name='map(terms)']"));
    }
    static synchronized public WebElement submitJoinNowButton() throws Exception {
        return findElementBy(By.id("form"));
    }
    static synchronized public WebElement dateOfBirdError() throws Exception {
        return findElementBy(By.xpath("//*[@id='signupForm']/fieldset[1]/label[5]"));
    }
    static synchronized public WebElement dodDay() throws Exception {
        return findElementBy(By.id("dobDay"));
    }
    static synchronized public WebElement dodMonth() throws Exception {
        return findElementBy(By.id("dobMonth"));
    }
    static synchronized public WebElement dodYear() throws Exception {
        return findElementBy(By.id("dobYear"));
    }
    static synchronized public WebElement emailAddress() throws Exception {
        return findElementBy(By.xpath("//input[@name='map(email)']"));
    }
    static synchronized public WebElement telephone() throws Exception {
        return findElementBy(By.xpath("//input[@name='map(phone)']"));
    }
    static synchronized public WebElement mobile() throws Exception {
        return findElementBy(By.xpath("//input[@name='map(mobile)']"));
    }
    static synchronized public WebElement addressLine1() throws Exception {
        return findElementBy(By.xpath("//input[@name='map(address1)']"));
    }
    static synchronized public WebElement addressCity() throws Exception {
        return findElementBy(By.xpath("//input[@name='map(addressCity)']"));
    }
    static synchronized public WebElement addressCounty() throws Exception {
        return findElementBy(By.xpath("//input[@name='map(stateProv)']"));
    }
    static synchronized public WebElement postCode() throws Exception {
        return findElementBy(By.xpath("//input[@name='map(postCode)']"));
    }
    static synchronized public WebElement selectCountry() throws Exception {
        return findElementBy(By.id("countryList"));
    }

    static synchronized public WebElement chooseUserName() throws Exception {
        return findElementBy(By.xpath("//input[@name='map(userName)']"));
    }

    static synchronized public WebElement choosePassword() throws Exception {
        return findElementBy(By.id("password"));
    }

    static synchronized public WebElement re_typePassword() throws Exception {
        return findElementBy(By.xpath("//input[@name='map(passwordConfirm)']"));
    }
    static synchronized public WebElement selectSecurityQuestion1() throws Exception {
        return findElementBy(By.id("securityQuestionOne"));
    }

    static synchronized public WebElement securityAnswer1() throws Exception {
        return findElementBy(By.xpath("//input[@name='map(securityAnswerOne)']"));
    }

    static synchronized public WebElement selectSecurityQuestion2() throws Exception {
        return findElementBy(By.id("securityQuestionTwo"));
    }

    static synchronized public WebElement securityAnswer2() throws Exception {
        return findElementBy(By.xpath("//input[@name='map(securityAnswerTwo)']"));
    }

    static synchronized public WebElement selectCurrency() throws Exception {
        return findElementBy(By.xpath("//select[@name='map(currency)']"));
    }




}
