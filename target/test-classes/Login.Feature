
Feature: Login

  Scenario: Successful login with valid Credentials
    Given Given User open URL "https://admin-demo.nopcommerce.com/login"
    When User enter Email as "admin@yourstore.com" and Password as "admin"
    And I click on Login button
    Then Page title should be "Dashboard / nopCommerce administration"
    When I click on logout button
    Then Page title should be "Your store. Login"

  @Login
  Scenario Outline: Successful login with valid Credentials
    Given Given User open URL "https://admin-demo.nopcommerce.com/login"
    When User enter Email as "<email>" and Password as "<password>"
    And I click on Login button
    Then Page title should be "Dashboard / nopCommerce administration"
    When I click on logout button
    Then Page title should be "Your store. Login"
    Examples:
      | email                | password |
      | admin@yourstore.com  | admin    |
      | admin1@yourstore.com | admin123 |