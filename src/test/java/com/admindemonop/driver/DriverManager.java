package com.admindemonop.driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {
    public static WebDriver driver;

    public DriverManager(){
        PageFactory.initElements(driver,this);
    }

    public void myBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public void goToUrl(String url){
        driver.get(url);
    }
    public void closeBrowser(){
        driver.quit();
    }
    public void maxWindow(){
        driver.manage().window().maximize();
    }

    public static String randomStrings() //generate unique string
    {
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return (generatedString);
    }
    public void waitForElement(WebElement element,long timeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
