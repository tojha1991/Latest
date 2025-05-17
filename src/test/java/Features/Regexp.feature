Feature: To Test Valid login functionality

  Scenario: Check login is successfull with valid credentials
    Given user is on login page
    When user enters "standard_user" and "secret_sauce"
    And clicks on Submit button
    Then user is able to log in