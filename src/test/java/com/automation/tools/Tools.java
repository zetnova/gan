package com.automation.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.automation.tools.SeleniumWebDriver.getWebDriver;


public class Tools {

    public static String url = "https://moneygaming.qa.gameaccount.com/";


    public static synchronized void buildDriver(BrowserType type) {
        SeleniumWebDriver.setWebDriver(type);
        getWebDriver().get(url);
    }

    public static synchronized WebElement findElementBy(By by) throws Exception {
        WebElement element = null;
        int br = 1;
        while (br <= 5) {
            try {
                br++;
                getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                WebDriverWait wait = new WebDriverWait(getWebDriver(), 10);
                element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
                getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                return element;
            } catch (Exception e) {
                if (br == 5) {
                    destroyDriver();
                    throw e;
                }
                try {
                    Thread.sleep(50);
                } catch (Exception exc) {
                }
            }
        }
        return element;
    }
    public static synchronized void switchWindows(){
        String parentWindow= getWebDriver().getWindowHandle();
        List<String> allWindows= Collections.singletonList(getWebDriver().getWindowHandle());
        for(String curWindow:allWindows){
            getWebDriver().switchTo().window(curWindow);
        }

    }


    public static synchronized void destroyDriver() {
        getWebDriver().quit();
    }




        }












