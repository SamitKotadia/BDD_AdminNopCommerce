package com.admindemonop.step_definition;

import com.admindemonop.driver.DriverManager;
import com.admindemonop.pages.SearchCustomerPage;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class SearchCustomerSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    SearchCustomerPage searchCustomerPage = new SearchCustomerPage();

    @When("^I enter customer Email$")
    public void i_enter_customer_Email() throws Throwable {
    searchCustomerPage.setEmail("victoria_victoria@nopCommerce.com");
    }

    @When("^I click on search button$")
    public void i_click_on_search_button() throws Throwable {
    searchCustomerPage.clickOnSearch();
    Thread.sleep(3000);
    }

    @Then("^I should found Email in the search table$")
    public void i_should_found_Email_in_the_search_table() throws Throwable {
    boolean status = searchCustomerPage.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
        Assert.assertEquals(true,status);
    }

    @When("^I enter customer FirstName$")
    public void i_enter_customer_FirstName() throws Throwable {
    searchCustomerPage.setFirstName("Victoria");
    }

    @When("^I enter customer LastName$")
    public void i_enter_customer_LastName() throws Throwable {
    searchCustomerPage.setLastName("Terces");
    }

    @Then("^I should found Name in the search table$")
    public void i_should_found_Name_in_the_search_table() throws Throwable {
    boolean status= searchCustomerPage.searchCustomerByName("Victoria Terces");
    Assert.assertEquals(true,status);
    }
}
