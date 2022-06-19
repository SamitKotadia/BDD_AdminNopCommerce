package com.admindemonop.step_definition;

import com.admindemonop.driver.DriverManager;
import com.admindemonop.pages.LoginPage;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class LoginSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    LoginPage loginPage = new LoginPage();

    @Given("^Given User open URL \"([^\"]*)\"$")
    public void given_User_open_URL(String currentURL) throws Throwable {
    driverManager.goToUrl(currentURL);

    }
    @When("^User enter Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void user_enter_Email_as_and_Password_as(String currentEmail, String currentPassword) throws Throwable {
    loginPage.enterEmail(currentEmail);
    loginPage.enterPassword(currentPassword);
    }

    @When("^I click on Login button$")
    public void i_click_on_Login_button() throws Throwable {
    loginPage.clickOnLoginBtn();
    }

    @Then("^Page title should be \"([^\"]*)\"$")
    public void page_title_should_be(String title) throws Throwable {
        if (driver.getPageSource().contains("Login was unsuccessful")){
            driverManager.closeBrowser();
           // Assert.assertTrue(false);
        } else {
            Assert.assertEquals(title,driver.getTitle());
        }

    }

    @When("^I click on logout button$")
    public void i_click_on_logout_button() throws Throwable {
    loginPage.clickOnLogoutButton();
    }

}
