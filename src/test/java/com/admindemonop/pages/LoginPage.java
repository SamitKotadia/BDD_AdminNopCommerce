package com.admindemonop.pages;

import com.admindemonop.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {

    @FindBy(id = "Email")
    WebElement txtEmail;

    @FindBy(id = "Password")
    WebElement txtPassword;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutButton;

    public void clickOnLogoutButton(){
        logoutButton.click();
    }

    public void clickOnLoginBtn(){
        loginButton.click();
    }

    public void enterEmail(String myMail){
        txtEmail.clear();
        txtEmail.sendKeys(myMail);
    }
    public void enterPassword(String pwd){
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }



}
