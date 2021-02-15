package com.automation.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class SeleniumWebDriver {

     private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();


    public static synchronized WebDriver getWebDriver() {
        return webDriver.get();
    }
    public static synchronized WebDriver setWebDriver(BrowserType type){
        WebDriver webDriver2 = null;
        switch (type){
            case CHROME:
                if(webDriver2 == null) {
                    ChromeOptions option = new ChromeOptions();
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/features/WebDrivers/chromedriver_linux");
                    DesiredCapabilities capability = DesiredCapabilities.chrome();
                    option.addArguments("--start-maximized");
                    webDriver2 = new ChromeDriver(option);
                    webDriver.set(webDriver2);
                }
                break;
            case FIREFOX:
                if(webDriver2 == null){
                    FirefoxOptions options = new FirefoxOptions();
                    System.setProperty("webdriver.gecko.driver", "src/test/resources/features/WebDrivers/geckodriver.exe");
                    DesiredCapabilities capability = DesiredCapabilities.firefox();
                    webDriver2 = new FirefoxDriver(options);
                    webDriver.set(webDriver2);
                    maximizeScreenFireFoxAndInternetExplorer();
                }
                break;

            default:
                if(webDriver2 == null) {
                    ChromeOptions option2 = new ChromeOptions();
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/features/WebDrivers/chromedriver.exe");
                    DesiredCapabilities capability2 = DesiredCapabilities.chrome();
                    option2.addArguments("--start-maximized");
                    webDriver2 = new ChromeDriver(option2);
                    webDriver.set(webDriver2);
                }
                break;
        }
        return webDriver2;
    }

     public static synchronized void maximizeScreenFireFoxAndInternetExplorer(){
        webDriver.get().manage().window().maximize();
    }

     public static synchronized void close() {
        webDriver.get().quit();

    }

}
