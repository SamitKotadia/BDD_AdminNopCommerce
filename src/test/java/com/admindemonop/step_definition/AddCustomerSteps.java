package com.admindemonop.step_definition;

import com.admindemonop.driver.DriverManager;
import com.admindemonop.pages.AddCustomerPage;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddCustomerSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    AddCustomerPage addCustomerPage = new AddCustomerPage();

    @Then("^I can can view dashboard$")
    public void i_can_can_view_dashboard() throws Throwable {

        Assert.assertEquals("Dashboard / nopCommerce administration", addCustomerPage.getPageTitle());

    }

    @When("^I click on customer menu$")
    public void i_click_on_customer_menu() throws Throwable {
     addCustomerPage.clickOnCustomerMenu();
    }

    @When("^I click on customers Manu Item$")
    public void i_click_on_customers_Manu_Item() throws Throwable {
    addCustomerPage.clickOnCustomerMenuItem();
    }

    @When("^I click on add new customer page$")
    public void i_click_on_add_new_customer_page() throws Throwable {
    addCustomerPage.clickOnAddNew();
    }

    @Then("^I can view add new customer page$")
    public void i_can_view_add_new_customer_page() throws Throwable {
    Assert.assertEquals("Add a new customer / nopCommerce administration",addCustomerPage.getPageTitle());
    }

    @When("^I enter customer info$")
    public void i_enter_customer_info() throws Throwable {
    String email = randomStrings()+"@gmail.com";
    addCustomerPage.setEmail(email);
    addCustomerPage.setPassword("test123");
    addCustomerPage.setFirstName("Samit");
    addCustomerPage.setLastname("Kotadia");
    addCustomerPage.setGender("Male");
    addCustomerPage.setDob("3/04/1990");
    addCustomerPage.setCompanyName("MCU");
        Thread.sleep(3000);
//    addCustomerPage.setCustomerRole("Guest");
//    Thread.sleep(2000);
    addCustomerPage.setManagerOfVendor("Vendor 2");
    Thread.sleep(3000);
    addCustomerPage.setAdminContent("for testing");


    }

    @When("^I click on save button$")
    public void i_click_on_save_button() throws Throwable {
        addCustomerPage.clickSave();
        Thread.sleep(3000);

    }

    @Then("^i can view confirmation massage \"([^\"]*)\"$")
    public void i_can_view_confirmation_massage(String confMsg) throws Throwable {
    boolean varification = driver.findElement(By.tagName("Body")).getText().contains(confMsg);
    Assert.assertTrue(varification);
    }

}
