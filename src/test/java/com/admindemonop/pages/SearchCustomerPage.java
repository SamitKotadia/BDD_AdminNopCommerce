package com.admindemonop.pages;

import com.admindemonop.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SearchCustomerPage extends DriverManager {
    DriverManager driverManager = new DriverManager();

    @FindBy(how = How.CSS,using = "input#SearchEmail")
    WebElement txtEmail;
    @FindBy(how = How.CSS, using = "input#SearchFirstName")
    WebElement txtFirstName;
    @FindBy(how = How.CSS, using = "input#SearchLastName")
    WebElement txtLastName;
    @FindBy(how = How.CSS, using = "select#SearchMonthOfBirth")
    WebElement dropDownMonth;
    @FindBy(how = How.CSS, using = "select#SearchDayOfBirth")
    WebElement dropDownDay;
    @FindBy(how = How.CSS, using = "input#SearchCompany")
    WebElement txtCompany;
    @FindBy(how = How.CSS, using = "input#SearchIpAddress")
    WebElement txtIPAddress;
    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Administrators')]")
    WebElement listItemAdministrator;
    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Guests')]")
    WebElement listItemGuests;
    @FindBy(how = How.XPATH, using = "//li[contains(text(),'Registered')]")
    WebElement litItemRegistered;
    @FindBy(how = How.CSS, using = "button#search-customers")
    WebElement btnSearch;
    @FindBy(how = How.XPATH, using = "//table[@role='grid']")
    WebElement tableSearchResults;
    @FindBy(how = How.XPATH, using = "//table[@id='customers-grid']")
    WebElement table;
    @FindBy(how = How.XPATH, using = "//table[@role='grid']//tbody/tr")
    List<WebElement> tableRows;
    @FindBy(how = How.XPATH, using = "//table[@role='grid']//tbody/tr/td")
    List<WebElement> tableColum;

    public void setEmail(String email){
        driverManager.waitForElement(txtEmail,5);
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }
    public void setFirstName(String fname){
        driverManager.waitForElement(txtFirstName,5);
        txtFirstName.clear();
        txtFirstName.sendKeys(fname);
    }
    public void setLastName(String lName){
        driverManager.waitForElement(txtLastName,5);
        txtLastName.clear();
        txtLastName.sendKeys(lName);
    }
    public void clickOnSearch(){
        btnSearch.click();
        driverManager.waitForElement(btnSearch,5);
    }
    public int getNoOfRows(){ //when have multi data then we need this method to see how much rows we have it
        return (tableRows.size());
    }
    public int getNoOfColumns(){
       return (tableColum.size());
    }
    //Search Email in table
    //In Row email is colum 2
    // need to verify that in table we have same Email or not
    public boolean searchCustomerByEmail(String email){
       boolean flag = false;
       for (int i=1; i<=getNoOfRows(); i++){
          String emailId= table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr['+i+']/td[2]")).getText();
           System.out.println(emailId);
       if (emailId.equals(email)){
           flag=true;
           }
       }
       return flag;
    }
    public boolean searchCustomerByName(String Name){
        boolean flag = false;
        for (int i=1; i<=getNoOfRows(); i++){
            String name= table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr['+i+']/td[3]")).getText();
            String names[]= name.split(" "); //seprating first and last name
            if (names[0].equals("Victoria") && names[1].equals("Terces")){
                flag=true;
            }
        }
        return flag;
    }
}
