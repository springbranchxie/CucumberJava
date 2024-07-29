Feature: Customers

  Background: Below are the common steps for each scenario
    Given user launch Chrome browser
    When user opens URL "http://admin-demo.nopcommerce.com/login"
    And user enters Email as "admin@yourstore.com" and Password as "admin"
    And click on Login
    Then user can view Dashboard

  
  Scenario: Add a new Customer
    When user click on customers Menu
    And click on customers Menu Item
    And click on Add new button
    Then user can view Add new customer page
    When user enter customer info
    And click on Save button
    Then user can view confirmation message "The new customer has been added successfully."
    When User click on Log out link
    And close browser

  Scenario: Search Customer by EmailID
    When user click on customers Menu
    And click on customers Menu Item
    And Enter customer Email
    When click on search button
    Then user should found Email in the search table
    And close browser

  Scenario: Search Customer by Name
    When user click on customers Menu
    And click on customers Menu Item
    And Enter customer FirstName
    And Enter customer LastName
    When click on search button
    Then User should found Name in the Search table
    And close browser
