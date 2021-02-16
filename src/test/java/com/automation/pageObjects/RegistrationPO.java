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
        return findElementBy(By.id("checkbox"));
    }
    static synchronized public WebElement submitJoinNowButton() throws Exception {
        return findElementBy(By.id("form"));
    }
    static synchronized public WebElement dateOfBirdError() throws Exception {
        return findElementBy(By.xpath("//*[@id='signupForm']/fieldset[1]/label[5]"));
    }






}
