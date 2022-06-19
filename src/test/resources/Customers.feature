@cf
Feature: Login

  Scenario: Successful adding new customer
    Given Given User open URL "https://admin-demo.nopcommerce.com/login"
    When User enter Email as "admin@yourstore.com" and Password as "admin"
    And I click on Login button
    Then I can can view dashboard
    When I click on customer menu
    And I click on customers Manu Item
    And I click on add new customer page
    Then I can view add new customer page
    When I enter customer info
    And I click on save button
    Then i can view confirmation massage "The new customer has been added successfully."

  Scenario: Search customer by Email ID
    Given Given User open URL "https://admin-demo.nopcommerce.com/login"
    When User enter Email as "admin@yourstore.com" and Password as "admin"
    And I click on Login button
    Then I can can view dashboard
    When I click on customer menu
    And I click on customers Manu Item
    And I enter customer Email
    When I click on search button
    Then I should found Email in the search table
  @scf
  Scenario: Search customer by Name
    Given Given User open URL "https://admin-demo.nopcommerce.com/login"
    When User enter Email as "admin@yourstore.com" and Password as "admin"
    And I click on Login button
    Then I can can view dashboard
    When I click on customer menu
    And I click on customers Manu Item
    And I enter customer FirstName
    And I enter customer LastName
    When I click on search button
    Then I should found Name in the search table