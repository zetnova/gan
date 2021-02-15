package com.automation.pageObjects;

import com.automation.tools.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPO extends Tools {


    static synchronized public WebElement companyTab() throws Exception {
        return findElementBy(By.xpath("//*[@id='menu-main-nav-1']/li[1]/a"));
    }

    static synchronized public WebElement companyMembers() throws Exception {
        return findElementBy(By.xpath("//*[@id='content']/div[2]/section[3]"));
    }
    static synchronized public WebElement facebookLink() throws Exception {
        return findElementBy(By.xpath("//a[@href='https://www.facebook.com/MusalaSoft?fref=ts']"));
    }




}
