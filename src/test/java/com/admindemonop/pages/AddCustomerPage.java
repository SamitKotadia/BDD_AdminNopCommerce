package com.admindemonop.pages;

import com.admindemonop.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class AddCustomerPage extends DriverManager {

    @FindBy(xpath = "//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]/p[1]")
    WebElement linkCustomerManu;
    @FindBy(xpath = "//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/p[1]")
    WebElement linkCustomersManuItem;
    @FindBy (xpath = "//a[@class='btn btn-primary']")
    WebElement btnAddNew;
    @FindBy (xpath = "//input[@id='Email']")
    WebElement txtEmail;
    @FindBy (xpath = "//input[@id='Password']")
    WebElement txtPassword;
    @FindBy (xpath = "//input[@id='FirstName']")
    WebElement txtFirstName;
    @FindBy (xpath = "//input[@id='LastName']")
    WebElement txtLastName;
    @FindBy (xpath = "//input[@id='Gender_Male']")
    WebElement radioBtnMaleGender;
    @FindBy (xpath = "//input[@id='Gender_Female']")
    WebElement radioBtnFemaleGender;
    @FindBy (xpath = "//input[@id='DateOfBirth']")
    WebElement txtDOB;
    @FindBy (xpath = "//input[@id='Company']")
    WebElement txtCompanyName;


    @FindBy (xpath = "//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[1]/div[1]/div[2]/div[5]/div[1]")
    WebElement txtCustomersRoles;
    @FindBy (xpath = "//ul[@id='SelectedCustomerRoleIds_taglist']//li//span[2]")
    WebElement txtDelete;
    @FindBy (xpath = "//li[contains(text(),'Administrators')]")
    WebElement isTitleAdministrator;
    @FindBy (xpath = "//li[contains(text(),'Registered')]")
    WebElement isTitleRegistered;
    @FindBy (xpath = "//li[contains(text(),'Guests')]")
    WebElement isTitleGuests;
    @FindBy (xpath = "//li[contains(text(),'Vendors')]")
    WebElement isTitleVendors;

    @FindBy (xpath = "//select[@id='VendorId']")
    WebElement dropDownOfVendor;
    @FindBy (xpath = "//textarea[@id='AdminComment']")
    WebElement txtAdminContent;
    @FindBy (xpath = "//button[@name='save']")
    WebElement btnSave;


    public String getPageTitle(){
        return driver.getTitle();
    }

    public void clickOnCustomerMenu(){
        linkCustomerManu.click();
    }
    public void clickOnCustomerMenuItem(){
        linkCustomersManuItem.click();
    }
    public void clickOnAddNew(){
        btnAddNew.click();
    }
    public void setEmail(String email){
        txtEmail.sendKeys(email);
    }
    public void setPassword(String password){
        txtPassword.sendKeys(password);
    }

    public void setCustomerRole(String role) throws InterruptedException {
//        if (!role.equals("Vendors")){
//          txtDelete.click();
//        }
//        txtCustomersRoles.click();
//        WebElement listItem;
//        Thread.sleep(3000);
//        if (role.equals("Administrators")){
//          listItem=isTitleAdministrator;
//        }
//        else if (role.equals("Guests")){
//            listItem=isTitleGuests;
//        }
//        else if (role.equals("Registered")){
//            listItem=isTitleRegistered;
//        }
//        else if (role.equals("Vendors")){
//            listItem=isTitleVendors;
//        }
//        else {
//            listItem=isTitleGuests;
//        }
//        listItem.click();
        txtCustomersRoles.clear();
        switch (role){
            case "Guests":
                isTitleGuests.click();
                break;
            case "Administrators":
                isTitleAdministrator.click();
                break;
            case "Registered":
                isTitleRegistered.click();
                break;
            case "Vendors":
                isTitleVendors.click();
                break;

        }

        Thread.sleep(3000);
    }
    public void setManagerOfVendor(String value){
        Select drp = new Select(dropDownOfVendor);
        drp.selectByVisibleText(value);
    }
    public void setGender(String gender){
        if (gender.equals("Male")){
            radioBtnMaleGender.click();
        }
        else if (gender.equals("Female")){
            radioBtnFemaleGender.click();
        }
        else {
            radioBtnMaleGender.click(); //default option
        }
    }
    public void setFirstName(String fName){
        txtFirstName.sendKeys(fName);
    }
    public void setLastname(String lName){
        txtLastName.sendKeys(lName);
    }
    public void setDob(String dob){
        txtDOB.sendKeys(dob);
    }
    public void setCompanyName(String comName){
        txtCompanyName.sendKeys(comName);
    }
    public void setAdminContent(String content){
        txtAdminContent.sendKeys(content);
    }
    public void clickSave(){
        btnSave.click();
    }






}
